package com.yuanyujin.command;

/**
 * @ClassName InvisibilitySpell
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/6 1:11 下午
 * @Version V1.0
 **/
public class InvisibilitySpell extends Command{

    private Visibility oldVisible;

    private Target target;

    @Override
    public void execute(Target target) {
        oldVisible = target.getVisibility();
        target.setVisibility(Visibility.INVISIBLE);
        this.target = target;
    }

    @Override
    public void undo() {
        if(oldVisible != null && target != null){
            Visibility visibility = target.getVisibility();
            target.setVisibility(oldVisible);
            oldVisible = visibility;
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
