package com.taobao.integral;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Objects;

@SpringBootApplication
public class ShoppingIntegralApplication {

    public static void main(String[] args) throws CloneNotSupportedException {
//        SpringApplication.run(ShoppingIntegralApplication.class, args);
        String obj1 = new String("张三");
        String obj2 = new String("张三");
        System.out.println(obj1 == obj2);
    }

}

@Data
@AllArgsConstructor
class CloneTestClass implements Cloneable {
    private String username;

    private int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
