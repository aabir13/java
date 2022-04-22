import java.util.*;
public class treeSet {
    public static void main(String[]args) {
        TreeSet<String> treeset = new TreeSet<String>();
        treeset.add("B");
        treeset.add("A");
        treeset.add("C");
        treeset.add("C");
        System.out.println(treeset);
        
        for(String i:treeset) {
            System.out.println(i);
        }

        treeset.remove("C");
        System.out.println(treeset);
    }
}
