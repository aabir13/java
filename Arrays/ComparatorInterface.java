//Code to demonstrate working of comparator interface
import java.util.*;
class Student
{
    int rollno;
    String name, address;
    public Student(int rollno, String name, String address)
    {
        this.rollno=rollno;
        this.name=name;
        this.address=address;
    }
    public String toString()
    {
        return this.rollno+" "+this.name+" "+this.address;
    }
}
class Sortbyroll implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}

public class ComparatorInterface 
{
    public static void main(String[] args)
    {
        Student[] arr={new Student(141,"ccc","london"), new Student(121,"aaa","paris"), new Student(131,"bbb","delhi")};
        System.out.println("Unsorted Array: ");
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
        Arrays.sort(arr, new Sortbyroll());
        System.out.println("\nSorted Array: ");
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }    
}