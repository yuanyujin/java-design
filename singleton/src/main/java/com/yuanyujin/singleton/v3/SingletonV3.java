package com.yuanyujin.singleton.v3;

/**
 * @ClassName SingletonV3
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/7 5:57 下午
 * @Version V1.0
 **/
public class SingletonV3 {

    private SingletonV3(){
    }

    public static SingletonV3 getInstance(){
        return HelperInstance.INSTANCE_V3;
    }

    private static class HelperInstance{
        private static final SingletonV3 INSTANCE_V3 = new SingletonV3();
    }
}
