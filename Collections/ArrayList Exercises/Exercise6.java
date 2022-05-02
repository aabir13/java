// Write a Java program to remove the third element from a array list.
import java.util.*;
public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println("Old List: "+list);
        list.remove(2);
        System.out.println("List after deleting third element: "+list);
    }    
}
