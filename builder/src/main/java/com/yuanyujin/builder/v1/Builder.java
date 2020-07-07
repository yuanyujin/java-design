package com.yuanyujin.builder.v1;

/**
 * @Interface Builder
 * @Description TODO
 * @Author yuanyujin
 **/
public abstract class Builder {

    public abstract void buildHead(String head);
    public abstract void buildArm(String arm);
    public abstract void buildBody(String body);
    public abstract void buildLeg(String leg);
    public abstract void buildFooter(String footer);
    public abstract People build();
}
