package com.lsy.demo;

import com.lsy.demo.entity.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompareTest {
    public static void main(String[] args) {
        // 2 45 22 99 7
        List<Apple> appleList = Arrays.asList(new Apple(2, "red1"), new Apple(45, "red5"),
            new Apple(22, "red8"), new Apple(99, "red2"), new Apple(7, "red11"));
        appleList.sort(Comparator.comparing(Apple::getWeight).reversed());
        appleList.forEach(apple -> System.out.println(apple.getWeight()));
        //System.out.println(Integer.compare(-9, 1));

    }
}
