package com.java8.StremAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDupliacteNumber {
    public static void main(String [] args){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(5);
        integerList.add(4);

        List<Integer> uniqueNums = integerList.stream()
                .distinct().collect(Collectors.toList());
        System.out.println("Array List >>> "+uniqueNums);

        List<Integer> integerList1 = Arrays.asList(1,3,2,4,5,5);
        List<Integer> removeNumber = integerList1.stream()
                .distinct().collect(Collectors.toList());
        System.out.println("Array As list >>> "+removeNumber);
    }
}
