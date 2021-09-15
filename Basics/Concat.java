//Code to demonstrate difference between concatenation [seen in case of strings] and addition
public class Concat 
{
    public static void main(String[] args)
    {
        int a=11;
        int b=7;
        //Summing both the numbers a and b [treating them as integers]
        System.out.println("Summation: "+(a+b));
        //Concatenating both the numbers a and b [treating them as strings]
        System.out.println("Concatenation: "+a+b);
    }
    
}