//Code to demonstrate fill() method of Array Class
import java.util.*;
public class ArrayClass8 
{
    public static void main(String[] args)
    {
        int ar[] = {10,20,15,22,35};
        int key=22;
        Arrays.fill(ar,key);
        System.out.println("Integer array on filling: "+Arrays.toString(ar));
    }    
}
