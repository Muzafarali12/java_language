package com.java8.StremAPI.DemoStreamAPI;

import java.util.ArrayList;
import java.util.List;

public class DemoStreamExample1 {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Customer c1 = new Customer();
        c1.setName("Imtiaz ");
        c1.setPhoneNumber("03073979...");
        c1.setResidency("Karachi");
        c1.setAge(19);

        Customer c2 = new Customer();
        c2.setName("Shayan ");
        c2.setPhoneNumber("03038979...");
        c2.setResidency("Hyderabad");
        c2.setAge(20);

        Customer c3 = new Customer();
        c3.setName("Asim ");
        c3.setPhoneNumber("0304568...");
        c3.setResidency("Khairpur");
        c3.setAge(22);

        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);

        customerList.stream()
                .filter(customer -> customer.getAge() > 20)
                .forEach(customer ->
                        System.out.println("that customer whose age is greater than 20 : "+customer));

    }


}
