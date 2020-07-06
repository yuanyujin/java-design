package com.yuanyujin.observer;

import java.util.*;

/**
 * @ClassName EventManager
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/6 3:25 下午
 * @Version V1.0
 **/
public class EventManager {

    Map<String, List<EventListener>> listeners = new HashMap<String, List<EventListener>>();

    public EventManager(String... operations) {
        for(String operation : operations){
            listeners.put(operation,new ArrayList<EventListener>());
        }
    }

    public void subscribe(String eventType,EventListener listener){
        if(listeners.containsKey(eventType)){
            listeners.get(eventType).add(listener);
        }else{
            listeners.put(eventType, Arrays.asList(listener));
        }
    }

    public void unsubscribe(String eventType,EventListener listener){
        if(listeners.containsKey(eventType)){
            listeners.get(eventType).remove(listener);
        }else
            return;
    }

    public void notify(String eventType,String content){
        if(listeners.containsKey(eventType)){
            for(EventListener listener : listeners.get(eventType)){
                listener.update(eventType,content);
            }
        }
    }
}
