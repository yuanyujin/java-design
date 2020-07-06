package com.yuanyujin.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Profile
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/4 1:32 下午
 * @Version V1.0
 **/
public class Profile {
    private String name;
    private String email;
    private Map<String, List<String>> contacts = new HashMap<String, List<String>>();

    public Profile(String name,String email,String... contacts){
        this.name = name;
        this.email = email;
        for(String contact: contacts){
            String[] parts = contact.split(":");
            String contactType = "friends" , contactEmail;
            if(parts.length == 1){
                contactEmail = parts[0];
            }else{
                contactType = parts[0];
                contactEmail = parts[1];
            }
            if(!this.contacts.containsKey(contactType)){
                this.contacts.put(contactType,new ArrayList<String>());
            }
            this.contacts.get(contactType).add(contactEmail);
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Map<String, List<String>> getContacts() {
        return contacts;
    }
}

