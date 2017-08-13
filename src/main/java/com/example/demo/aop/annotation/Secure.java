package com.example.demo.aop.annotation;


import com.example.demo.enums.Role;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Inherited
public @interface Secure {

    Role[] role() default Role.USER;
}
