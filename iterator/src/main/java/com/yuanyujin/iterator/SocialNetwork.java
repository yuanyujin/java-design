package com.yuanyujin.iterator;

/**
 * @Interface SocialNetwork
 * @Description TODO
 * @Author yuanyujin
 **/
public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
