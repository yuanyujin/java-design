package com.yuanyujin.builder.v1;

/**
 * @ClassName PeopleBuilder
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/7 9:31 上午
 * @Version V1.0
 **/
public class PeopleBuilder extends Builder{

    private String head;
    private String arm;
    private String body;
    private String leg;
    private String footer;

    @Override
    public void buildHead(String head) {
        this.head = head;
    }

    @Override
    public void buildArm(String arm) {
        this.arm = arm;
    }

    @Override
    public void buildBody(String body) {
        this.body = body;
    }

    @Override
    public void buildLeg(String leg) {
        this.leg = leg;
    }

    @Override
    public void buildFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public People build() {
        return new People(head,arm,body,leg,footer);
    }
}
