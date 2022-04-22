import java.util.*;
public class treeMap {
    public static void main(String[]args) {
        TreeMap <Integer, String> treemap = new TreeMap<>();    
        //Whenever we entry elements inside a tree map they are naturally sorted or ordered as per the key
        treemap.put(3,"c");
        treemap.put(2,"b");
        treemap.put(1,"a");
        System.out.println(treemap);
    }
}
