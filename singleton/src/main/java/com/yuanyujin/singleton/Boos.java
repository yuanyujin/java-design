package com.yuanyujin.singleton;

/**
 * @ClassName Boos
 * @Description 枚举也是单例
 * @Author yuanyujin
 * @Date 2020/7/7 4:23 下午
 * @Version V1.0
 **/
public class Boos {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("singleton:"+singleton);

        Singleton singleton1 = Singleton.getInstance();
        System.out.println("singleton1:"+singleton1);

    }
}
