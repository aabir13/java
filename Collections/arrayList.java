import java.util.*;
public class arrayList {
    public static void main(String[]args) {
        //List: Type of interface & ArrayList: Concrete class implementation
        List<Integer> arraylist = new ArrayList<Integer>(5);
        for(int i=1; i<=5; i++) {
            //Adding elements into the list
            arraylist.add(i);
        }

        //Displaying elements
        System.out.println(arraylist);
        
        //Removing element at index 3
        arraylist.remove(3);
        System.out.println(arraylist);
        
        //Printing elements one by one from the list
        for(int i=0; i<arraylist.size(); i++) {
            System.out.print(arraylist.get(i)+" ");
        }
        System.out.println();
        for(int i : arraylist) {
            System.out.println(i);
        }
    }
}