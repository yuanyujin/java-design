package com.yuanyujin.iterator;

/**
 * @Interface ProfileIterator
 * @Description TODO
 * @Author yuanyujin
 **/
public interface ProfileIterator {

    boolean hasNext();

    Profile next();

    void reset();
}
