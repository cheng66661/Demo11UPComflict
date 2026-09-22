package com.atguigu.demo11upcomflict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo11UpComflictApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo11UpComflictApplication.class, args);
        System.out.println("line");
        System.out.println("12");
        System.out.println("12");
        System.out.println("666");
    }

}
