package com.qixiaotian.decorator;

import com.qixiaotian.basic.Beverage;

/**
 * @author qixiaotian
 * @date 2020/8/25 20:45
 * @description 装饰者类：调料
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
