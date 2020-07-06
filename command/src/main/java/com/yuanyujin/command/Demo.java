package com.yuanyujin.command;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/6 1:10 下午
 * @Version V1.0
 **/
public class Demo {

    public static void main(String[] args) {
        Wizard me = new Wizard();
        Goblin you = new Goblin();

        you.printStatus();

        me.castSpell(you,new ShrinkSpell());
        you.printStatus();

        me.castSpell(you,new InvisibilitySpell());
        you.printStatus();

        me.undoLastSpell(you);
        you.printStatus();

        me.undoLastSpell(you);
        you.printStatus();

        me.redoLastSpell(you);
        you.printStatus();
    }
}
