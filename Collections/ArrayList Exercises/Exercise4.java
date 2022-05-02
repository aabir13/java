// Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.*;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        System.out.println(list.get(index));
        sc.close();
    }
}
