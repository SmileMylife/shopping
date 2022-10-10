package com.taobao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JDKTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> collect = list.stream().filter(elem -> elem == 2).collect(Collectors.toList());
        System.out.println(collect);

        Map<Boolean, List<Integer>> result = list.stream().collect(Collectors.partitioningBy(elem -> elem > 2));
    }
}
