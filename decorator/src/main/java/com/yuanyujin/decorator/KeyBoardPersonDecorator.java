package com.yuanyujin.decorator;

/**
 * @ClassName KeyBoardPersonDecorator
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/17 3:14 下午
 * @Version V1.0
 **/
public class KeyBoardPersonDecorator implements People{

    private People decorator;

    public KeyBoardPersonDecorator(People decorator) {
        this.decorator = decorator;
    }

    public void say() {
        decorator.say();
        System.out.println("I am your father...");
    }
}
