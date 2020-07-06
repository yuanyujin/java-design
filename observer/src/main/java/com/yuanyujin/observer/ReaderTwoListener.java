package com.yuanyujin.observer;

/**
 * @ClassName ReaderTwoListener
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/6 3:52 下午
 * @Version V1.0
 **/
public class ReaderTwoListener implements EventListener{

    private String name;

    public ReaderTwoListener(String name) {
        this.name = name;
    }

    public void update(String eventType, String content) {
        System.out.println(name + "订阅了"+eventType+" 内容："+ content);
    }
}
