package com.yuanyujin.command;

/**
 * @Enum Visibility
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/6 12:35 下午
 * @Version V1.0
 **/
public enum Visibility {

    VISIBLE("visible"),
    INVISIBLE("invisible");

    private String title;

    Visibility(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
