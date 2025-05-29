package com.java8.StremAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lowerToUpper {
    public static void main(String [] args){
        List<String> stringList = Arrays.asList("rohan","kumar","kantesh","raja","ali");
        List<String> upperNames = stringList.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.print("Upper case : "+upperNames);
    }
}
