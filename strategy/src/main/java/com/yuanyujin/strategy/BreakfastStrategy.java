package com.yuanyujin.strategy;

/**
 * @ClassName BreakfastStrategy
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/7 11:04 上午
 * @Version V1.0
 **/
public class BreakfastStrategy implements FoodStrategy{
    public void doEat() {
        System.out.println("breakfast eat bread and milk");
    }
}
