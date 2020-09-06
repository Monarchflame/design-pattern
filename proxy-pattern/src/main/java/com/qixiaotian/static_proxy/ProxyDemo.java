package com.qixiaotian.static_proxy;

/**
 * @author qixiaotian
 * @date 2020/9/6 14:15
 * @description
 */
public class ProxyDemo {

    public static void main(String[] args) {
        IHello proxy = new HelloProxy(new HelloSpeaker());
        proxy.hello("Justin");
    }
}
