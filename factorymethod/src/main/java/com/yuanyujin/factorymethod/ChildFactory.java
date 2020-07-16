package com.yuanyujin.factorymethod;

/**
 * @ClassName ChildFactory
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/13 1:31 下午
 * @Version V1.0
 **/
public class ChildFactory extends PeopleFactory{
    @Override
    public People create() {
        return new Child();
    }
}
