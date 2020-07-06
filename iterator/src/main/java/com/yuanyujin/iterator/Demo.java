package com.yuanyujin.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/4 2:23 下午
 * @Version V1.0
 **/
public class Demo {

    public static void main(String[] args) {
        SocialNetwork network = new Facebook(createProfiles());
        SocialSpammer spammer = new SocialSpammer(network);
        spammer.sendSpamToCoworker("yuan@test.com","发工资了");
        spammer.sendSpamToFriends("yu@test.com","放假了");
    }

    private static List<Profile> createProfiles(){
        List<Profile> profiles = new ArrayList<Profile>();
        profiles.add(new Profile("yuan","yuan@test.com","friends:yu@test.com","friends:jin@test.com","coworkers:dou@test.com"));
        profiles.add(new Profile("yu","yu@test.com","friends:yuan@test.com","friends:jin@test.com","coworkers:dou@test.com"));
        profiles.add(new Profile("dou","dou@test.com","friends:yuan@test.com","friends:jin@test.com","coworkers:yu@test.com"));
        profiles.add(new Profile("jin","jin@test.com","friends:yu@test.com","friends:yuan@test.com","coworkers:dou@test.com"));
        return profiles;
    }
}
