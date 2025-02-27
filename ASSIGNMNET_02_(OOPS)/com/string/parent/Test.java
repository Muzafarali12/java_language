package com.string.parent;

public class Test {
    public static void main(String [] args){
        String name = " Miya";
        String name1 = "   ";
        System.out.println("1-  Upper Case = "+name.toUpperCase());
        System.out.println("2-  Lower Case = "+name.toLowerCase());
        System.out.println("3-  Size       = "+name.length());
        System.out.println("4-              = "+name.charAt(3));
        String middle = "     roshan";
        System.out.println(middle.trim());
        String name2 = "aslam khan";

        System.out.println("6-  Check if letter is given        = "+middle.contains("ro"));
        System.out.println("7-  Check Index Element   = "+name.indexOf('a'));
        System.out.println("8-  Finding Last index    = "+name.lastIndexOf('y'));
        System.out.println("9-  Replace a Character   = "+middle.replace('o','0'));
        System.out.println("10- Replace a Word        = "+name.replace(" Miya","abass"));
        System.out.println("11- check is String empty = "+name.isBlank());
        System.out.println("12- Check for space With letters "+name1.isEmpty());
        System.out.println("13- First Letter ko Upper Case = "+name2.substring(0,1).toUpperCase() + name2.substring(1));

        String word = "Hello World";
        System.out.println("14- Word ko extract karne ke liye  = "+word.substring(0,5));
        System.out.println("15- agar koi index de to us se agee   = "+word.substring(6));

        System.out.println("<<<<<<<<<<<<<<<<<<< Words Counting Programm>>>>>>>>>>>>>>>>>>>>>>");

        String sentence = "Hello This is Muzzafar Ali And i am Hello word  Programmer";
        String[] result = sentence.split(" ");
        System.out.println("Total Words = "+result.length);


        System.out.println("<<<<<<<<<<<<<<<<<<< Vovel, Constant, Spaces Counting Programm>>>>>>>>>>>>>>>>>>>>>>");

    }
}

