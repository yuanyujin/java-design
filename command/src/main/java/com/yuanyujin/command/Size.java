package com.yuanyujin.command;

/**
 * @Enum Size
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/6 12:33 下午
 * @Version V1.0
 **/
public enum Size {

    SMALL("small"),
    NORMAL("normal");

    private String title;

    Size(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
