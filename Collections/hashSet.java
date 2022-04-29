import java.util.*;
public class hashSet {
    public static void main(String[]args) {
        Set<String> hashset = new HashSet<String>();
        //Adding elements to the hash set
        hashset.add("A");
        hashset.add("B");
        hashset.add("C");
        hashset.add("C");
        System.out.println(hashset);
        System.out.println("Does the hash set contain element C? "+hashset.contains("C"));

        //Removing elements from the hash set
        hashset.remove("A");
        System.out.println(hashset);

        //Printing elements of the hash set individually
        for(String i : hashset) {
            System.out.println(i);
        }
    }
}
