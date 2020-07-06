package com.yuanyujin.command;

/**
 * @ClassName ShrinkSpell
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/6 12:45 下午
 * @Version V1.0
 **/
public class ShrinkSpell extends Command{

    private Size oldSize;

    private Target target;

    @Override
    public void execute(Target target) {
        oldSize = target.getSize();
        target.setSize(Size.SMALL);
        this.target = target;
    }

    @Override
    public void undo() {
        if(oldSize != null && target != null){
            Size temp = target.getSize();
            target.setSize(oldSize);
            oldSize = temp;
        }
    }

    @Override
    public void redo() {
        undo();
    }

    @Override
    public String toString() {
        return null;
    }
}
