class Employee{
String name;
String address;
int salary;
String jobTitle;
}
class Manager extends Employee{



public void calculatingBonuses(){
System.out.println("");
System.out.println("");
name="Ali";
System.out.println("Name = "+name);
address="Karachi cant-Station";
System.out.println("Address = "+address);
jobTitle="Managger";
System.out.println("Job Title ="+jobTitle);
salary=500000;
System.out.println("Salary = "+salary);
int bonus = salary * 5 / 100;
int cBonus = (bonus + salary);
System.out.println("According to your Bonus and monthly salary your new salary : "+cBonus);
}
}

class Developer extends Employee{
public void calculatingBonuses(){
System.out.println("");
System.out.println("");
name="Aliza";
System.out.println("Name = "+name);
address="Karachi Landhi-Station";
System.out.println("Address = "+address);
jobTitle="Developer";
System.out.println("Job Title ="+jobTitle);
salary=300000;
System.out.println("Salary = "+salary);
}
public void generatingPerformanceReports(){
System.out.println("Your performance is better.");
}
}

class Programmer extends Employee{
public void calculatingBonuses(){
System.out.println("");
System.out.println("");
name="Alina";
System.out.println("Name = "+name);
address="Karachi city-Station";
System.out.println("Address = "+address);
jobTitle="Managger";
System.out.println("Job Title ="+jobTitle);
salary=400000;
System.out.println("Salary = "+salary);
}
public void managingProjects(){
System.out.println("Please manage this project i request you");
}
}

public class CompanyEmployees {
public static void main(String [] args){
Manager m = new Manager();
m.calculatingBonuses();
Developer d = new Developer();
d.calculatingBonuses();
d.generatingPerformanceReports();
Programmer p = new Programmer();
p.calculatingBonuses();
p.managingProjects();
}
} 