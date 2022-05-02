// Write a Java program to create a new array list, add some colors (string) and print out the collection.
import java.util.*;
public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Blue");
        ar.add("Red");
        ar.add("Pink");
        ar.add("Green");
        System.out.println(ar);
    }
}