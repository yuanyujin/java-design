package com.yuanyujin.factorymethod;

/**
 * @ClassName Child
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/13 1:26 下午
 * @Version V1.0
 **/
public class Child implements People{

    public void buyStuff() {
        go();
        System.out.println("buy some stuff");
    }

    public void go() {
        System.out.println("run to ");
    }
}
