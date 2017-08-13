package com.example.demo.interceptor;

import com.example.demo.bean.AuthenticatedEntityContext;
import com.example.demo.bean.ThreadLocalWrapper;
import com.example.demo.controller.RequiresAuthentication;
import com.example.demo.dto.AdminDto;
import com.example.demo.dto.UserDto;
import com.example.demo.enums.Role;
import com.example.demo.exception.InvalidAccessTokenException;
import com.example.demo.service.AdminService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AccessTokenInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            if (((HandlerMethod) handler).getBean() instanceof RequiresAuthentication) {
                String authorizationHeader = request.getHeader("Authorization");

                if (authorizationHeader == null) {
                    throw new InvalidAccessTokenException();
                }

                String[] authorizationComponents = authorizationHeader.split("\\s+");

                if (authorizationComponents.length != 2) {
                    throw new InvalidAccessTokenException();
                }

                String accessToken = authorizationComponents[1];
                String entityId;
                String entityName;
                String entityEmail;
                Role role;

                switch (authorizationComponents[0]) {

                    case "Token":
                        UserDto userDto = userService.identify(accessToken);
                        entityId = userDto.getId();
                        entityName = userDto.getName();
                        entityEmail = userDto.getEmail();
                        role = Role.USER;
                        break;

                    case "AdminKey":
                        AdminDto adminDto = adminService.identify(accessToken);
                        entityId = adminDto.getId();
                        entityName = adminDto.getName();
                        entityEmail = null;
                        role = Role.ADMIN;
                        break;

                    default:
                        throw new InvalidAccessTokenException();
                }

                AuthenticatedEntityContext authenticatedEntityContext =
                        new AuthenticatedEntityContext(entityId, entityEmail, entityName, accessToken, request.getRemoteAddr(), role);
                ThreadLocalWrapper.putRequestEntityContext(authenticatedEntityContext);
            }
        }

        return true;
    }
}
