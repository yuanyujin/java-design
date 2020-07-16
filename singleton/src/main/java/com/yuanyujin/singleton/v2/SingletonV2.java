package com.yuanyujin.singleton.v2;

/**
 * @ClassName SingletonV2
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/7 4:31 下午
 * @Version V1.0
 **/
public class SingletonV2 {

    private static SingletonV2 singletonV2 = new SingletonV2();

    private SingletonV2() {
    }

    public SingletonV2 getSingletonV2(){
        return singletonV2;
    }
}
