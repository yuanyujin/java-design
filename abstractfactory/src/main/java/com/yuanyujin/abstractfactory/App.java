package com.yuanyujin.abstractfactory;

/**
 * @ClassName FactoryUtils
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/10 5:58 下午
 * @Version V1.0
 **/
public class App {

    public static void main(String[] args) {
        KingdomFactory factory = FactoryMaker.makerFactory(FactoryMaker.KingdomType.ELF);
        King king = factory.createKing();
        System.out.println(king);
        KingdomFactory orcFactory = FactoryMaker.makerFactory(FactoryMaker.KingdomType.ORC);
        King orcKing = orcFactory.createKing();
        System.out.println(orcKing);
    }
}
