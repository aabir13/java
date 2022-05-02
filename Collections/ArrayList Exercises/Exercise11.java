// Write a Java program to reverse elements in a array list.
import java.util.*;
public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List before reversing: "+list);
        Collections.reverse(list);
        System.out.println("List after reversing: "+list);
        sc.close();
    }
}
