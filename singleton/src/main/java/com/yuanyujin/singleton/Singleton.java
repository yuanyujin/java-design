package com.yuanyujin.singleton;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/7 4:21 下午
 * @Version V1.0
 **/
public class Singleton {

    private static Singleton singleton ;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
