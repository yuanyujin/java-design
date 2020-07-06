package com.yuanyujin.command;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName Wizard
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/6 1:02 下午
 * @Version V1.0
 **/
public class Wizard {

    private Deque<Command> undoList = new LinkedList<Command>();
    private Deque<Command> redoList = new LinkedList<Command>();

    public void castSpell(Target target,Command command){
        command.execute(target);
        undoList.offerLast(command);
    }

    public void undoLastSpell(Target target){
        if(!undoList.isEmpty()){
            Command command = undoList.pollLast();
            redoList.offerLast(command);
            command.undo();
        }
    }

    public void redoLastSpell(Target target){
        if(!redoList.isEmpty()){
            Command command = redoList.pollLast();
            undoList.offerLast(command);
            command.redo();
        }
    }

}
