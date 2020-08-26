package com.qixiaotian;

import com.qixiaotian.basic.Beverage;
import com.qixiaotian.basic.DarkRoast;
import com.qixiaotian.basic.Espresso;
import com.qixiaotian.basic.HouseBlend;
import com.qixiaotian.decorator.Mocha;
import com.qixiaotian.decorator.Soy;
import com.qixiaotian.decorator.Whip;

/**
 * @author qixiaotian
 * @date 2020/8/25 20:54
 * @description
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
