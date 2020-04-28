package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Service
public class LuckymoneyService {
    @Autowired
    private LuckymoneyRepository respository;
//Transactional表示要么两个交易都成功 要么都不成功
    @Transactional
    public void createTwo() {
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("chenyo");
        luckymoney1.setMoney(new BigDecimal("0.52"));
        respository.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("chenyo");
        luckymoney2.setMoney(new BigDecimal("0.2"));
        respository.save(luckymoney2);
    }
}
