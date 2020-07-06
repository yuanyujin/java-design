package com.yuanyujin.command;

/**
 * @ClassName Goblin
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/6 12:41 下午
 * @Version V1.0
 **/
public class Goblin extends Target{

    public Goblin() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    public String toString() {
        return "Goblin";
    }
}
