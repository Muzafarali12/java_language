package com.java8.StremAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class findingSmallerNumber {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);
        integerList.add(70);
        integerList.add(80);
        integerList.add(90);
        integerList.add(100);
        int smallerNumber = integerList.stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println("Smaller Number in list is : "+smallerNumber);
    }
}
