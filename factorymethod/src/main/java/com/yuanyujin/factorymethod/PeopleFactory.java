package com.yuanyujin.factorymethod;

/**
 * @ClassName PeopleFactory
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/13 1:29 下午
 * @Version V1.0
 **/
public abstract class PeopleFactory {

    public void buy(){
        People people = create();
        people.buyStuff();
    }

    public abstract People create();
}
