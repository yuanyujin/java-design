package com.yuanyujin.composite;

/**
 * @ClassName App
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/13 1:54 下午
 * @Version V1.0
 **/
public class App {

    public static void main(String[] args) {

        People boy = new Boy();
        boy.say();
        System.out.println();
        People girl = new Girl();
        girl.say();
        System.out.println();
        People parent = new Parent();
        parent.say();
        System.out.println();
        People family = new Family(boy,girl,parent);
        family.say();
    }
}
