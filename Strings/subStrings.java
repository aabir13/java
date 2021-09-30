//Code to understand slicing and substrings
import java.util.*;
public class subStrings 
{
    public static void main(String[] args)
    {
        String s1="Aabir Datta";
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(0,3));
        String text=new String("Hi everyone. I am Aabir Datta");
        String[] sentences = text.split("\\.");//Splitting the texts into sentences (the ones ending with '.') and creating an array of the same
        System.out.println(Arrays.toString(sentences));
    } 
}
