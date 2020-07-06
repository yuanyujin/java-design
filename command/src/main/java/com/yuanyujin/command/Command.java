package com.yuanyujin.command;

/**
 * @ClassName Command
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/6 12:28 下午
 * @Version V1.0
 **/
public abstract class Command {

    public abstract void execute(Target target);

    public abstract void undo();

    public abstract void redo();

    @Override
    public abstract String toString();
}
