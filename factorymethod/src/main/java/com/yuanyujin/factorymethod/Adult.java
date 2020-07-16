package com.yuanyujin.factorymethod;

/**
 * @ClassName Adult
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/13 1:28 下午
 * @Version V1.0
 **/
public class Adult implements People{
    public void buyStuff() {
        go();
        System.out.println("buy some drink");
    }

    public void go() {
        System.out.println("drive car to ");
    }
}
