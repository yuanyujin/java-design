package com.yuanyujin.prototype.breaksingleton;

/**
 * @ClassName HungerSingleton
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/7 9:37 下午
 * @Version V1.0
 **/
public class HungerSingleton implements Cloneable{

    private static HungerSingleton instance = new HungerSingleton();

    private HungerSingleton() {
    }

    public static HungerSingleton getInstance(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return getInstance();
//    }
}
