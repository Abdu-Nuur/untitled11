package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,1,1,1,2,2,3,3,4,5,6,7,9,0,0,11,11,5,15);
        int a = 0;
        for (int i = 0; i < 16; i++) {
            int finalI = i;
            long l = list.stream().filter(x -> x.equals(finalI)).count();
            System.out.println(i+"="+l);
        }


    }
}
