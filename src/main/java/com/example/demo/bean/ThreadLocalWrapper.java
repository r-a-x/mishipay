package com.example.demo.bean;

public class ThreadLocalWrapper {

    private static final ThreadLocal<AuthenticatedEntityContext> context;

    static {
        context = new ThreadLocal<>();
    }

    public static AuthenticatedEntityContext getRequestEntityContext() {
        return context.get();
    }

    public static void putRequestEntityContext(AuthenticatedEntityContext authenticatedEntityContext) {
        context.set(authenticatedEntityContext);
    }
}
