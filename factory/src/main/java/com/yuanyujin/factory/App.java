package com.yuanyujin.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName App
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/10 5:15 下午
 * @Version V1.0
 **/
public class App {

    public static void main(String[] args) {
        PeopleFactory factory = PeopleFactory.build(builder -> {
            builder.add(PersonType.BOY,Boy::new);
            builder.add(PersonType.GIRL,Girl::new);
            builder.add(PersonType.ADULT,Adult::new);
        });

        People people = factory.create(PersonType.BOY);

        System.out.println(people);

    }
}
