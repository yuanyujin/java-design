package com.yuanyujin.iterator;

/**
 * @ClassName SocialSpammer
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/4 2:18 下午
 * @Version V1.0
 **/
public class SocialSpammer {

    public SocialNetwork network;
    public ProfileIterator iterator;

    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    public void sendSpamToFriends(String profileEmail,String message){
        iterator = network.createFriendsIterator(profileEmail);
        while (iterator.hasNext()){
            Profile profile = iterator.next();
            sendMessage(profile.getEmail(),message);
        }
    }

    public void sendSpamToCoworker(String profileEmail,String message){
        iterator = network.createCoworkersIterator(profileEmail);
        while (iterator.hasNext()){
            Profile profile = iterator.next();
            sendMessage(profile.getEmail(),message);
        }
    }

    private void sendMessage(String email,String message){
        System.out.println("send message to : "+email+",message is "+message);
    }
}
