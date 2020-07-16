package com.yuanyujin.factorymethod;

/**
 * @ClassName App
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/13 1:32 下午
 * @Version V1.0
 **/
public class App {

    public static void main(String[] args) {
        PeopleFactory factory = new AdultFactory();
        factory.buy();

        factory = new ChildFactory();
        factory.buy();
    }
}
