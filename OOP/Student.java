
//Code to understand the concept of classes and objects
import java.util.*;

public class Student {
    String name;
    int age;
    double gpa;

    // A constructor which allows user to call this segment any number of times,
    // giving it multiple values as per the system
    Student(String name, int age, double gpa) {
        this.name = name; // this keyword allows Java to refer to the class variable
        this.age = age;
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name = sc.nextLine();
        System.out.println("Enter the age of the student");
        int age = sc.nextInt();
        System.out.println("Enter the gpa of the student");
        double gpa = sc.nextDouble();
        Student s = new Student(name, age, gpa);
        System.out.println("NAME: " + s.getName());
        System.out.println("AGE: " + s.getAge());
        System.out.println("GPA: " + s.getGpa());
        sc.close();
    }
}