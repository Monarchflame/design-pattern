package com.qixiaotian.dynamic_proxy;

/**
 * @author qixiaotian
 * @date 2020/9/6 14:15
 * @description
 */
public class ProxyDemo {

    public static void main(String[] args) {
        LogHandler logHandler = new LogHandler();
        IHello helloProxy = (IHello) logHandler.getProxy(new HelloSpeaker());
        helloProxy.hello("doctor");
    }
}
