package com.yuanyujin.builder.v2;

/**
 * @ClassName People
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/7 9:45 上午
 * @Version V1.0
 **/
public class People {

    private String head;
    private String butt;
    private String foot;

    public People(String head, String butt, String foot) {
        this.head = head;
        this.butt = butt;
        this.foot = foot;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getButt() {
        return butt;
    }

    public void setButt(String butt) {
        this.butt = butt;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    @Override
    public String toString() {
        return "People{" +
                "head='" + head + '\'' +
                ", butt='" + butt + '\'' +
                ", foot='" + foot + '\'' +
                '}';
    }

    public static class Builder{

        private String head;
        private String butt;
        private String foot;

        public Builder builderHead(String head){
            this.head = head;
            return this;
        }

        public Builder builderButt(String butt){
            this.butt = butt;
            return this;
        }

        public Builder builderFoot(String foot){
            this.foot = foot;
            return this;
        }

        public People build(){
            return new People(head,butt,foot);
        }
    }
}
