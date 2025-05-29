package com.java8.StremAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class sortSalleryInDescendingOrder {

    public static void main(String [] args){

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ali Hassan", "HR-Management", 55000, 22));
        employees.add(new Employee("Sara Ahmed", "Finance", 65000, 30));
        employees.add(new Employee("Zain Khan", "IT", 75000, 28));
        employees.add(new Employee("Ayesha Malik", "Marketing", 48000, 25));

        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .forEach(System.out::println);

    }
}
