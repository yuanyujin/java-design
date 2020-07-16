package com.yuanyujin.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Family
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/13 1:50 下午
 * @Version V1.0
 **/
public class Family implements People{

    List<People> persons = new ArrayList<People>();

    public Family(People... persons) {
        for(People people: persons){
            this.persons.add(people);
        }
    }

    public void say() {
        persons.stream().forEach(person ->person.say());
    }
}
