package com.yuanyujin.factorymethod;

/**
 * @ClassName AdultFactory
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/13 1:30 下午
 * @Version V1.0
 **/
public class AdultFactory extends PeopleFactory{

    @Override
    public People create() {
        return new Adult();
    }
}
