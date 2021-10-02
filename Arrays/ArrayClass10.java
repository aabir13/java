//Code to demonstrate parallelSort() method of Arrays Class
//Parallel sort functions on merge sort algorithm
import java.util.*;
public class ArrayClass10 
{
    public static void main(String[] args)
    {
        int ar[] = {10,20,35,15,22};
        Arrays.parallelSort(ar);
        System.out.println("Integer Array: "+Arrays.toString(ar));
    }    
}