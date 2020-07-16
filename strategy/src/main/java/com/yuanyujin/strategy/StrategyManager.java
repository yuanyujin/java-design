package com.yuanyujin.strategy;

/**
 * @ClassName StrategyManager
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/7 11:06 上午
 * @Version V1.0
 **/
public class StrategyManager {
    private FoodStrategy foodStrategy;

    public StrategyManager(FoodStrategy foodStrategy) {
        this.foodStrategy = foodStrategy;
    }

    public void changeStrategy(FoodStrategy foodStrategy){
        this.foodStrategy = foodStrategy;
    }

    public void execute(){
        foodStrategy.doEat();
    }
}
