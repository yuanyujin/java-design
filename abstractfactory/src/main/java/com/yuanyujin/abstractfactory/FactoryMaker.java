package com.yuanyujin.abstractfactory;

/**
 * @ClassName FactoryMaker
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/10 6:00 下午
 * @Version V1.0
 **/
public class FactoryMaker {

    enum KingdomType{
        ELF,ORC;
    }

    public static KingdomFactory makerFactory(KingdomType type){
        switch (type){
            case ELF:
                return new ElfKingdomFactory();
            case ORC:
                return new OrcKingdomFactory();
            default:
                throw new IllegalArgumentException("KingdomType not supported.");
        }

    }
}
