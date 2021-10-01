//Code to demonstrate copyOfRange() function in Arrays Class
import java.util.*;
public class ArrayClass6 
{
    public static void main(String[] args)
    {
        int ar[] = {10,20,15,22,35};
        //To print the array elements in one line
        System.out.println("Integer Array: "+Arrays.toString(ar));
        System.out.println("New Array using copyOfRange function: ");
        //To copy the array into an array of new length
        System.out.println("Integer Array: "+Arrays.toString(Arrays.copyOfRange(ar,1,3))); 
    }
}