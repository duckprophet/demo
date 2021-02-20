package com.chu.common;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class DemoApplicationTests {
    public static void main(String[] args) {
        System.out.println("hello,git");
        String num = ChuStringUtil.getFirstFloFromStr(".100.21");
        System.out.println(num);
        BigDecimal b  = new BigDecimal(num);
        System.out.println(b);
        System.out.println(BigDecimal.valueOf(0.00));
    }


    @Test
    void contextLoads() {
        System.out.println("hello,git");
    }

}
