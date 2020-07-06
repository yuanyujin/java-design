package com.yuanyujin.observer;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/6 3:53 下午
 * @Version V1.0
 **/
public class Demo {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.getEventManager().subscribe("悲惨世界",new ReaderOneListener("yuanyujin"));
        editor.getEventManager().subscribe("围墙",new ReaderTwoListener("yuanyujin"));
        editor.getEventManager().subscribe("悲惨世界",new ReaderTwoListener("蚂蚱"));

        editor.publishBookOne();
        editor.publishBookTwo();
    }
}
