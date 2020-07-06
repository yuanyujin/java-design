package com.yuanyujin.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FacebookIterator
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/4 2:00 下午
 * @Version V1.0
 **/
public class FacebookIterator implements ProfileIterator{
    private Facebook facebook;
    private String type;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<String>();
    private List<Profile> profiles = new ArrayList<Profile>();

    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad(){
        if(emails.size() == 0){
            List<String> profiles = facebook.requestFriendsProfile(email,type);
            if(profiles == null){
                return;
            }
            for(String profile : profiles){
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    public Profile next() {
        if(!hasNext()){
            return null;
        }
        String friendEmail = emails.get(currentPosition);
        Profile profile = profiles.get(currentPosition);
        if(profile == null){
            profile = facebook.requestProfile(friendEmail);
            profiles.set(currentPosition,profile);
        }
        currentPosition ++ ;
        return profile;
    }

    public void reset() {
        currentPosition = 0;
    }
}
