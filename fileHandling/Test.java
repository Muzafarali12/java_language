package com.Student.fileHandling;

import com.Student.mapExample.Student;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String [] args){
        // creating file
        File file = new File("test.txt");
        // try catch block
       try {
           // check file is created yes or no
           if (file.createNewFile()){
               System.out.println("File Created!");
           }
           // data writing in file
           FileWriter fileWriter = new FileWriter(file);
           fileWriter.write("Hello this is first file creating\n");
           fileWriter.write("Hello tis is Meer Muzzafar.\n");
           fileWriter.close();
           // data reading word by word
           FileReader reader = new FileReader(file);
           int read = reader.read();
           while (read!=-1){
               System.out.println((char) read);
               read = reader.read();
           }
           // an other file creating
           File file1 = new File("united3.txt");
           FileWriter fileWriter1 = new FileWriter(file1);
           fileWriter1.write("Hello this is third file.\n");
           fileWriter1.write("Do respect take respect\n");
           fileWriter1.close();
           // second class file se data ko read kar rha hai word by word
           FileReader reader1 = new FileReader(file1);
           Scanner obj = new Scanner(reader1);
           while (obj.hasNext()){
               System.out.println(obj.nextLine());
           }

           File file2 = new File("united.txt");
           FileWriter fileWriter2 = new FileWriter(file2);
           fileWriter2.write("Name,Age\n");
           fileWriter2.write("Muzzafar Ali,23\n");
           fileWriter2.write("Raja Zafar,24\n");
           fileWriter2.write("Mudasir,18\n");
           fileWriter2.close();
           System.out.println("\n File Reading Using Scanner Class");

           //FileReader reader2 = new FileReader(file2);
           Scanner obj2 = new Scanner(file2);
           obj2.nextLine();
           List<Student> studentList = new ArrayList<>();
           while (obj2.hasNext()){
               String line = obj2.nextLine();
               String [] arr = line.split(",");
               Student student = new Student();
               student.setName(arr[0]);
               student.setAge(Short.parseShort(arr[1]));
               studentList.add(student);
           }
           System.out.println("Name : "+studentList);
       }
       catch (IOException e){
           throw new RuntimeException(e);
       }
    }
}
