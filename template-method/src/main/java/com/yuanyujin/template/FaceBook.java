package com.yuanyujin.template;

/**
 * @ClassName FaceBook
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/6 5:36 下午
 * @Version V1.0
 **/
public class FaceBook extends NetWork{

    public boolean login(String username, String password) {
        System.out.println("login checking...");
        System.out.println("checking username: "+username);
        System.out.print("checking password: ");
        for(int i = 0 ; i <password.length() ;i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("登录中");
        simulateNetworkLatency();
        System.out.println(username+"登录成功");
        return true;
    }

    public boolean sendData(String data) {
        System.out.print("数据发送中");
        simulateNetworkLatency();
        System.out.println("message: "+ data +" was posted to facebook");
        return true;
    }

    public void logout() {
        System.out.println("登出成功...");
    }

    private void simulateNetworkLatency(){
        int i = 0;
        while (i<10){
            try {
                Thread.sleep(1000);
                System.out.print(".");
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
