package com.caih.cloudec.config;

import org.springframework.core.NamedThreadLocal;

public class PlatformHolder {
    public static final ThreadLocal<String> context = new NamedThreadLocal<>("platform_context");

    public static void resetContext() {
        context.remove();
    }

    public static void setContext(String platformId) {
        if (context == null) {
            resetContext();
        } else {
            context.set(platformId);
        }
    }

    public static String getContext() {
        return context.get();
    }
}