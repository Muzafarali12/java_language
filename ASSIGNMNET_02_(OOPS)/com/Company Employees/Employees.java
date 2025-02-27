package com;
import java.util.Scanner;
public class Employees {
    private int employeeFirstNumber;
    private float salaryFirst;
    public void addMember(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Number. ");
        employeeFirstNumber = input.nextInt();
        System.out.print("Enter Employee Salary");
        salaryFirst = input.nextInt();

    }
    public void show(){
        System.out.println("Employee Number : "+employeeFirstNumber);
        System.out.println("Employee Salary : "+salaryFirst);
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Employees[] employees = new Employees[3];

        for(int i = 0; i < employees.length; i++){
            System.out.println("Enter details for Employees "+ (i + 1) + ":");
            employees[i] = new Employees();
            employees[i].addMember();
        }
        System.out.println("Employee Details ");
        for( int i = 0; i < employees.length; i++){
            System.out.println("Employee "+(i + 1) + ":");
            employees[i].show();
        }
    }
}
