package com.hx.hxapollo.util;

public class AppUtil {
    private static Integer timeout;

    public static Integer getTimeout() {
        return timeout;
    }

    public static void setTimeout(Integer timeout) {
        AppUtil.timeout = timeout;
    }
}
