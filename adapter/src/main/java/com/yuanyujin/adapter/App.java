package com.yuanyujin.adapter;

import java.util.*;

/**
 * @ClassName App
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/17 3:39 下午
 * @Version V1.0
 **/
public class App {

    public static void main(String[] args) {
        int message = 123;
        ServiceAdapter adapter = new ServiceAdapter(new Service());
        adapter.print(message);
    }
}
