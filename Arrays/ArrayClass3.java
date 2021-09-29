//Code to demonstrate binary search using binarySearch() function in Arrays Class
import java.util.*;
public class ArrayClass3 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ar[] = {5,2,1,4,7,3};
        Arrays.sort(ar);
        System.out.println("Enter the element to be found");
        int key=sc.nextInt();
        int f=Arrays.binarySearch(ar,key);
        if(f<ar.length && f>0)
            System.out.println("Element found in array at position: "+f);
        else
            System.out.println("Element not found in the array");
        sc.close();
    }
    
}
