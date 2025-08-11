
package model;

public class Student {
    private String name;
    private int age;
    private String rollNumber;
    private String gender;
    private String course;
    private String department;

   
    public Student(String name, int age, String rollNumber, String gender, String course, String department) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.gender = gender;
        this.course = course;
        this.department = department;
    }


    public Student(){}
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getRollNumber() { return rollNumber; }
    public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
