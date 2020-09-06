package com.qixiaotian.dynamic_proxy;

import java.util.logging.*;
import java.lang.reflect.*;

/**
 * @author qixiaotian
 * @date 2020/9/6 14:21
 * @description
 */

public class LogHandler implements InvocationHandler {
    private Logger logger = Logger.getLogger(this.getClass().getName());

    private Object object;

    public Object getProxy(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) {
        Object result = null;

        try {
            log("method starts..." + method);

            Thread.sleep(100); //为了让输出有序

            result = method.invoke(object, args);

            logger.log(Level.INFO, "method ends..." + method);
        } catch (Exception e) {
            log(e.toString());
        }

        return result;
    }

    private void log(String message) {
        logger.log(Level.INFO, message);
    }
}