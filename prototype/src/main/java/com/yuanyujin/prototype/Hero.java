package com.yuanyujin.prototype;

import java.util.Date;

/**
 * @ClassName Hero
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/7 9:31 下午
 * @Version V1.0
 **/
public class Hero implements Cloneable{

    private String name;
    private Date birthday;

    public Hero(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Hero hero = (Hero) super.clone();
        hero.birthday = (Date) hero.getBirthday().clone();
        return hero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
