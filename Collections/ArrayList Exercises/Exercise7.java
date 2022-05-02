// Write a Java program to search an element in a array list.
import java.util.*;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        if(list.contains(n)) {
            System.out.println("Element is found");
        }
        else {
            System.out.println("Element not found");
        }
        sc.close();
    }
}