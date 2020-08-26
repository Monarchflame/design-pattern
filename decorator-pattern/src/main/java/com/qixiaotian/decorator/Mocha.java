package com.qixiaotian.decorator;

import com.qixiaotian.basic.Beverage;

/**
 * @author qixiaotian
 * @date 2020/8/25 20:53
 * @description
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
