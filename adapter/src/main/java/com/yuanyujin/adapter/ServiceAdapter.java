package com.yuanyujin.adapter;

/**
 * @ClassName ServiceAdapter
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/17 3:38 下午
 * @Version V1.0
 **/
public class ServiceAdapter {

    private Service service;

    public ServiceAdapter(Service service) {
        this.service = service;
    }

    public void print(int message){
        service.printString(String.valueOf(message));
    }
}
