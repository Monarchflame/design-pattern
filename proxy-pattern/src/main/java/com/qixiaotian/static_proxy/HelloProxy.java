package com.qixiaotian.static_proxy;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author qixiaotian
 * @date 2020/9/6 14:14
 * @description
 */

public class HelloProxy implements IHello {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    private IHello helloObject;

    public HelloProxy(IHello helloObject) {
        this.helloObject = helloObject;
    }

    public void hello(String name) {
        // 日志服务
        log("hello method starts....");

        // 逻辑
        helloObject.hello(name);

        try {
            Thread.sleep(100); //为了让输出有序
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 日志服务
        log("hello method ends....");
    }

    private void log(String msg) {
        logger.log(Level.INFO, msg);
    }
}