package com.yuanyujin.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @Interface PeopleFactory
 * @Description TODO
 * @Author yuanyujin
 **/
public interface PeopleFactory {

    People create(PersonType personType);

    static PeopleFactory build(Consumer<Builder> consumer){
        Map<PersonType,Supplier<People>> map = new HashMap<>();
        consumer.accept(map::put);
        return personType -> map.get(personType).get();
    }
}
