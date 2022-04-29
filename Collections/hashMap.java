import java.util.*;
public class hashMap {
    public static void main(String[]args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        System.out.println("Size of the map: "+map.size());
        System.out.println(map);

        if(map.containsKey("a")) {
            Integer a = map.get("a");
            System.out.println("Value of key \"a\": "+a);
        }

        for(String key:map.keySet()) {
            System.out.println("Key: "+key+"; Value: "+map.get(key));
        }
    }
}
