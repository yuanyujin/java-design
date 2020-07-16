package com.yuanyujin.strategy;

/**
 * @ClassName People
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/7 11:07 上午
 * @Version V1.0
 **/
public class People {
    public static void main(String[] args) {

        StrategyManager manager = new StrategyManager(new BreakfastStrategy());
        manager.execute();
        manager.changeStrategy(new LunchStrategy());
        manager.execute();
    }
}
