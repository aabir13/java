// Write a Java program to iterate through all elements in a array list.
import java.util.*;
public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(4);
        ar.add(3);
        ar.add(2);
        ar.add(12);
        ar.add(10);
        ar.add(8);
        ar.add(14);
        ar.add(15);
        ar.add(9);
        ar.add(20);
        for(int i: ar){
            System.out.println(i);
        }
    }
}
