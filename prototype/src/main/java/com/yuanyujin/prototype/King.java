package com.yuanyujin.prototype;

import java.util.Date;

/**
 * @ClassName King
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/7 9:34 下午
 * @Version V1.0
 **/
public class King {


    public static void main(String[] args) throws CloneNotSupportedException {
        Hero hero = new Hero("yaun",new Date(0L));
        Hero cloneHero = (Hero) hero.clone();

        System.out.println(hero);
        System.out.println(cloneHero);

        hero.setBirthday(new Date(666666666666L));
        System.out.println(hero);
        System.out.println(cloneHero);

    }
}
