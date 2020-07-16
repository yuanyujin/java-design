package com.yuanyujin.strategy;

/**
 * @ClassName LunchStrategy
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/7 11:05 上午
 * @Version V1.0
 **/
public class LunchStrategy implements FoodStrategy{

    public void doEat() {
        System.out.println("lunch eat fish and cow");
    }
}
