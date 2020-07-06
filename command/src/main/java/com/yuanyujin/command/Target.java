package com.yuanyujin.command;

/**
 * @ClassName Target
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/6 12:31 下午
 * @Version V1.0
 **/
public abstract class Target {

    public Size size;

    public Visibility visibility;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @Override
    public abstract String toString();

    public void printStatus(){
        System.out.println(this + ",size = " + getSize() + ",visible = "+ getVisibility());
    }
}
