package com.yuanyujin.template;

/**
 * @ClassName NetWork
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/6 4:50 下午
 * @Version V1.0
 **/
public abstract class NetWork {

    public abstract boolean login(String username,String password);
    public abstract boolean sendData(String data);

    public abstract void logout();

    public boolean post(String username,String password,String data){
        if(login(username,password)){
            boolean result = sendData(data);
            logout();
            return result;
        }
        return false;
    }

}
