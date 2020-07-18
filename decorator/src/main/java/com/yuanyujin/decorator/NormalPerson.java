package com.yuanyujin.decorator;

/**
 * @ClassName NormalPerson
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/17 3:13 下午
 * @Version V1.0
 **/
public class NormalPerson implements People{
    public void say() {
        System.out.println("hello world!");
    }
}
