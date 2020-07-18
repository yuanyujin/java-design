package com.yuanyujin.decorator;

/**
 * @ClassName App
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/17 3:15 下午
 * @Version V1.0
 **/
public class App {

    public static void main(String[] args) {
        People normal = new NormalPerson();
        normal.say();
        People keyboardHero = new KeyBoardPersonDecorator(normal);
        keyboardHero.say();
    }

}
