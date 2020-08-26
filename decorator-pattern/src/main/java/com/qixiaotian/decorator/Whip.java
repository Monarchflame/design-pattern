package com.qixiaotian.decorator;

import com.qixiaotian.basic.Beverage;

/**
 * @author qixiaotian
 * @date 2020/8/25 20:57
 * @description
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
