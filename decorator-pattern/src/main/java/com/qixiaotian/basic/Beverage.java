package com.qixiaotian.basic;

/**
 * @author qixiaotian
 * @date 2020/8/25 20:43
 * @description 基类：饮料
 */
public abstract class Beverage {
    String description = "Unknown com.qixiaotian.basic.Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
