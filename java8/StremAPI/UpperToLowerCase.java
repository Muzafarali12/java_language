package com.java8.StremAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {
    public static void main(String [] args){
        List<String> stringList = Arrays.asList("G.AKBAR","AIJAZ","MUSHTAQUE","ALTAF","NAIQ-DEN","JAN-MUHAMMAD");
        List<String> lowerCase = stringList.stream().map(String::toLowerCase)
                .collect(Collectors.toList());

    }
}
