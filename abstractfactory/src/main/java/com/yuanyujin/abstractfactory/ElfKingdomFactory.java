package com.yuanyujin.abstractfactory;

/**
 * @ClassName ElfKingdomFactory
 * @Description TODO
 * @Author yuanyujin
 * @Date 2020/7/10 5:57 下午
 * @Version V1.0
 **/
public class ElfKingdomFactory implements KingdomFactory{
    public King createKing() {
        return new ElfKing();
    }
}
