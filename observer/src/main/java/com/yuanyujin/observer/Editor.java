package com.yuanyujin.observer;

/**
 * @ClassName Editor
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/6 3:24 下午
 * @Version V1.0
 **/
public class Editor {

    private EventManager eventManager;

    public Editor() {
        this.eventManager = new EventManager("悲惨世界","围墙");
    }

    public void publishBookOne(){
        eventManager.notify("悲惨世界","啊，我的世界好悲惨");
    }

    public void publishBookTwo(){
        eventManager.notify("围墙","完了，我的人生都被堵在墙里了");
    }

    public EventManager getEventManager() {
        return eventManager;
    }
}
