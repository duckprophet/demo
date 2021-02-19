package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class DemoApplicationTests {
    public static void main(String[] args) {
        System.out.println("hello,git");
        BigDecimal a = new BigDecimal("");
        System.out.println(a);

    }


    @Test
    void contextLoads() {
        System.out.println("hello,git");
    }

}
