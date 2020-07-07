package com.yuanyujin.builder.v1;

/**
 * @ClassName People
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/7 9:20 上午
 * @Version V1.0
 **/
public class People {

    private String head;
    private String arm;
    private String body;
    private String leg;
    private String footer;

    public People(String head, String arm, String body, String leg, String footer) {
        this.head = head;
        this.arm = arm;
        this.body = body;
        this.leg = leg;
        this.footer = footer;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getArm() {
        return arm;
    }

    public void setArm(String arm) {
        this.arm = arm;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getLeg() {
        return leg;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return "People{" +
                "head='" + head + '\'' +
                ", arm='" + arm + '\'' +
                ", body='" + body + '\'' +
                ", leg='" + leg + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }
}
