package com.qixiaotian.static_proxy;

/**
 * @author qixiaotian
 * @date 2020/9/6 14:14
 * @description
 */
public class HelloSpeaker implements IHello {

    @Override
    public void hello(String name) {
        System.out.println("Hello, " + name);
    }

}