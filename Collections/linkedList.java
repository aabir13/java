import java.util.*;
public class linkedList {
    public static void main(String[]args) {
        LinkedList<String> list = new LinkedList<String>();
        //Adding elements to the linked list
        list.add("A");
        list.add("B");
        list.addFirst("C");
        list.addLast("D");
        list.add(2, "E");
        System.out.println(list);

        //Removing elements from the linked list
        list.remove("B");
        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
