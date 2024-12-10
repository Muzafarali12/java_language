class Student {
String name;
int age;
String department;
String university;
int marks;

public void marksGrading(int marks){
int total = 850;
double grading = marks / 8.5;
System.out.println("You got : "+grading+"% ");
} 

public void subjectMarks(int marks){

if(marks > 650 ){
System.out.println("You got A grade.");
}

else if(marks > 500 && marks < 650){
System.out.println("You got b grade.");
}
else {
System.out.println("You got c grade.");
}

}
public static void main(String [] args){

Student Naveed = new Student();
Naveed.name = "Naveed";
Naveed.age = 19;
Naveed.department = "S-E";
Naveed.university = "SMIU";
Naveed.marks = 450;

Student Asif = new Student();
Asif.name = "M.Asif";
Asif.age = 20;
Asif.department = "I-T";
Asif.university = "Mehran";
Asif.marks = 560;

Student Habib = new Student();
Habib.name = "Habib";
Habib.age = 20;
Habib.department = "C-S";
Habib.university = "SMIU";
Habib.marks = 680;

Student Shahzad = new Student();
Shahzad.name = "Shahzad-Ali";
Shahzad.age = 21;
Shahzad.department = "S-E";
Shahzad.university = "SMIU";
Shahzad.marks = 720;

Student Israr = new Student();
Israr.name = "Israr-S";
Israr.age = 22;
Israr.department = "BBA";
Israr.university = "Dawood";
Israr.marks = 660;
System.out.println("<<<<< Students Details >>>>>");

System.out.println("");

System.out.println("Name : "+Naveed.name);
System.out.println("Age : "+Naveed.age);
System.out.println("D-P : "+Naveed.department);
System.out.println("Uni : "+Naveed.university);
System.out.println("Marks : "+Naveed.marks);
Naveed.marksGrading(Naveed.marks);
Naveed.subjectMarks(Naveed.marks);
System.out.println("");

System.out.println("Name : "+Asif.name);
System.out.println("age : "+Asif.age);
System.out.println("D-P : "+Asif.department);
System.out.println("Uni : "+Asif.university);
System.out.println("Marks : "+Asif.marks);
Asif.marksGrading(Asif.marks);
Asif.subjectMarks(Asif.marks);
System.out.println("");

System.out.println("Name : "+Habib.name);
System.out.println("Age : "+Habib.age);
System.out.println("D-p : "+Habib.department);
System.out.println("Uni : "+Habib.university);
System.out.println("Marks : "+Habib.marks);
Habib.marksGrading(Habib.marks);
Habib.subjectMarks(Habib.marks);
System.out.println("");

System.out.println("Name : "+Shahzad.name);
System.out.println("Age : "+Shahzad.age);
System.out.println("D-p : "+Shahzad.department);
System.out.println("Uni : "+Shahzad.university);
System.out.println("Marks : "+Shahzad.marks);
Shahzad.marksGrading(Shahzad.marks);
Shahzad.subjectMarks(Habib.marks);
System.out.println("");

System.out.println("Name : "+Israr.name);
System.out.println("Age : "+Israr.age);
System.out.println("D-p : "+Israr.department);
System.out.println("Uni : "+Israr.university);
System.out.println("Marks : "+Israr.marks);
Israr.marksGrading(Israr.marks);
Israr.subjectMarks(Israr.marks);
}
}