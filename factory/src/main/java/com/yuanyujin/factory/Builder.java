package com.yuanyujin.factory;

import java.util.function.Supplier;

/**
 * @Interface Builder
 * @Description TODO
 * @Author yuanyujin
 **/
public interface Builder {

    void add(PersonType type, Supplier<People> supplier);
}
