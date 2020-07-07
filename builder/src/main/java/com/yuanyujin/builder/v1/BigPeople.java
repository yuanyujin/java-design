package com.yuanyujin.builder.v1;

/**
 * @ClassName BigPeople
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/7 9:40 上午
 * @Version V1.0
 **/
public class BigPeople {

    public static void main(String[] args) {
        Builder builder = new PeopleBuilder();
        builder.buildHead("tou");
        builder.buildArm("hand");
        builder.buildBody("body");
        builder.buildLeg("leg");
        builder.buildFooter("jiao");
        People people = builder.build();
        System.out.println(people.toString());
    }
}
