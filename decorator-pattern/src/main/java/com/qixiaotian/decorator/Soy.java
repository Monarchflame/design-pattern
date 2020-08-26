package com.qixiaotian.decorator;

import com.qixiaotian.basic.Beverage;

/**
 * @author qixiaotian
 * @date 2020/8/25 20:58
 * @description
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
