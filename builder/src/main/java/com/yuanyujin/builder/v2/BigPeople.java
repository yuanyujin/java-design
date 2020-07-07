package com.yuanyujin.builder.v2;

/**
 * @ClassName BigPeople
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/7 9:49 上午
 * @Version V1.0
 **/
public class BigPeople {

    public static void main(String[] args) {
        People people = new People.Builder().builderHead("tou").builderButt("pigu").builderFoot("jiao").build();
        System.out.println(people.toString());
    }
}
