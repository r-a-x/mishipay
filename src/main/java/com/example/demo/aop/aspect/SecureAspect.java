package com.example.demo.aop.aspect;

import com.example.demo.aop.annotation.Secure;
import com.example.demo.bean.ThreadLocalWrapper;
import com.example.demo.enums.Role;
import com.example.demo.exception.AuthorizationException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.CodeSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Order(1)
@Aspect
public class SecureAspect {

    @Around("(execution(* *.*(..)) && @annotation(com.example.demo.aop.annotation.Secure)) || (@within(com.example.demo.aop.annotation.Secure))")
    public Object secure(final ProceedingJoinPoint joinPoint) throws Throwable {
        Secure secure = extractAnnotationFromJoinPoint(joinPoint);

        List<Role> allowedRoles = Arrays.asList(secure.role());
        Role currentRole = ThreadLocalWrapper.getRequestEntityContext().getRole();

        if (!allowedRoles.contains(currentRole)) {
            throw new AuthorizationException();
        }

        return joinPoint.proceed();
    }

    private Secure extractAnnotationFromJoinPoint(final ProceedingJoinPoint joinPoint) throws NoSuchMethodException {
        Secure annotationOnMethod = joinPoint.getTarget().getClass().getMethod(joinPoint.getSignature().getName(),
                ((CodeSignature) joinPoint.getSignature()).getParameterTypes()).getAnnotation(Secure.class);

        if (annotationOnMethod == null) {
            return joinPoint.getTarget().getClass().getAnnotation(Secure.class);
        }

        return annotationOnMethod;
    }
}

