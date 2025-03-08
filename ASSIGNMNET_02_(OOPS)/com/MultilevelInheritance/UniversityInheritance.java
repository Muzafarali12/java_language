package com.test.MultilevelInheritance;
import java.util.Scanner;
public class UniversityInheritance {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        HeadOfDepartment[] person = new HeadOfDepartment[4];

        System.out.println("Enter Details of Head Of Department.");
        System.out.print("Name = ");
        String name = input.next();
        System.out.print("Department = ");
        String department = input.next();
        System.out.print("Department I'd  = ");
        int departmentId = input.nextInt();
        System.out.print("Contact Number  = ");
        String contactNumber = input.next();

        person[0] = new HeadOfDepartment(name,department,departmentId,contactNumber);

        System.out.println("Enter Co-ordinator details.");
        System.out.print("Co-Ordinator Name  = ");
        String coOrdinaterName = input.next();
        System.out.print("Co-Ordinator I'd  = ");
        int coOrdinaterId = input.nextInt();

        person[1] = new CoOrdinator(name,department,departmentId,contactNumber,coOrdinaterName,coOrdinaterId);

        System.out.println("Enter Faculties details. ");
        System.out.print("Faculties Name = ");
        String facultyName = input.next();
        System.out.print("Faculties I'd  = ");
        int facultyId = input.nextInt();

        person[2] = new Faculties(name,department,departmentId,contactNumber,coOrdinaterName,coOrdinaterId,facultyName,facultyId);

        System.out.println("Enter Student Details.  ");
        System.out.print("Student Name = ");
        String studentName = input.next();
        System.out.print("Student I'd  = ");
        int studentId = input.nextInt();

        person[3] = new Students(name,department,departmentId,contactNumber,coOrdinaterName,coOrdinaterId,facultyName,facultyId,studentName,studentId);


                System.out.println("Display Information......................");
        for(int i=0; i < person.length; i++){
            person[i].display();
            System.out.println();

        }
    }

}
