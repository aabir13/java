// Write a Java program to sort a given array list.
import java.util.*;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Pink");
        list.add("Green");
        list.add("Black");
        list.add("White");
        System.out.println("List before sorting: "+list);
        Collections.sort(list);
        System.out.println("List after sorting: "+list);
        sc.close();
    }    
}
