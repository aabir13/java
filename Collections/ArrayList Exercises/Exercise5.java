// Write a Java program to update specific array element by given element.
import java.util.*;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int element = sc.nextInt();
        int index = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.println("Old List: "+list);
        list.set(index,element); // Update the desired element of the list
        System.out.println("Update List: "+list);
        sc.close();
    }
}
