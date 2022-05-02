// Write a Java program to copy one array list into another.
import java.util.*;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        System.out.println("Initial List1: "+list1);
        System.out.println("Initial List2: "+list2);
        Collections.copy(list1,list2);
        System.out.println("List after copying: "+list1);
        System.out.println("List after copying: "+list2);
        sc.close();
    }
}
