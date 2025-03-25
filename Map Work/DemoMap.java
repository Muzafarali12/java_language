package com.Student.mapExample;

import java.security.Key;
import java.util.*;

public class DemoMap {
    public static void main(String [] args){
        Map<Student,String> integerStringMap = new HashMap<>();

        Student s1 = new Student();
        s1.setName("Rohan");
        s1.setAge((short)7);

        Student s2 = new Student();
        s2.setName("Shifa");
        s2.setAge((short)5);

        Student s5 = new Student();
        s5.setName("Soonh");
        s5.setAge((short)19);

        Student s3 = new Student("Hitesh",(short)9);
        Student s4 = new Student("Rahool",(short)10);

        integerStringMap.put(s1,"BSE-23F");
        integerStringMap.put(s2,"BDE-23F");
        integerStringMap.put(s3,"IT-22F");
        integerStringMap.put(s4,"CS-21S");
        integerStringMap.put(s5,"BPA-23F");

        for (Student student : integerStringMap.keySet())   //using keyset() method for iteration over keySet
            System.out.println("Name: " + student.getName()  +"  Age: "+student.getAge());

        for (String string: integerStringMap.values())         //using values() for iteration over keys
            System.out.println("ID: " + string);

        Map<String,String> map = new LinkedHashMap<>();
        map.put("Ali","202");
        map.put("Kamran","203");
        map.put("Asim","204");

        map.forEach((key,value) ->
            System.out.println("Name :"+key +"  ID : "+value));

        System.out.println("Using Key Set.");
        for(String key :map.keySet()){
            String value = map.get(key);
            System.out.println("Name : "+key +" ID : "+value);
        }
    }

}

