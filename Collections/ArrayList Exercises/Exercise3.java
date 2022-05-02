// Write a Java program to insert an element into the array list at the first position. 
import java.util.*;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(3);
        ar.add(4);
        System.out.println("Old List: "+ar);
        ar.add(0, n); //Inserting element in desired position
        System.out.println("New List: "+ar);
        sc.close();
    } 
}
