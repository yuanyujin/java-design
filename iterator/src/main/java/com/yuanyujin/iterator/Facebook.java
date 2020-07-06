package com.yuanyujin.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Facebook
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/4 1:44 下午
 * @Version V1.0
 **/
public class Facebook implements SocialNetwork{

    private List<Profile> profiles;

    public Facebook(List<Profile> profiles) {
        if(profiles == null){
            this.profiles = new ArrayList<Profile>();
        }
        else
            this.profiles = profiles;
    }

    public Profile requestProfile(String profileEmail){
        simulateNetworkLatency();
        return findProfile(profileEmail);
    }

    public List<String> requestFriendsProfile(String profileEmail,String contactType){
        simulateNetworkLatency();
        Profile profile = findProfile(profileEmail);
        if(profile != null){
            return profile.getContacts().get(contactType);
        }
        return null;
    }

    private void simulateNetworkLatency(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Profile findProfile(String profileEmail){
        for (Profile profile: profiles){
            if(profileEmail.equals(profile.getEmail())){
                return profile;
            }
        }
        return null;
    }

    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new FacebookIterator(this,"friends",profileEmail);
    }

    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this,"coworkers",profileEmail);
    }
}
