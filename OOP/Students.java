
//Code to understand the classic concept of Encapsulation
import java.util.*;

public class Students {
    private String name;
    private int age;
    private double gpa;

    public Students(String name, int age, double gpa) {
        this.name = name;
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

    @Override
    public String toString() {
        return ("NAME: " + this.getName() + "\nAGE: " + this.getAge() + "\nGPA: " + this.getGpa());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter the age of the student: ");
        int age = sc.nextInt();
        System.out.println("Enter the GPA of the student: ");
        double gpa = sc.nextDouble();
        Students s = new Students(name, age, gpa);
        System.out.println(s.toString());
        sc.close();
    }
}
