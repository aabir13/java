//Code to see the ways how to initialize a string and convert a character array to string
public class charArraytoString 
{
    public static void main(String[] args)
    {
        String s1 = "Aabir";
        char ch[]={'a','a','b','i','r'};
        String s2 = new String(ch);
        String s3 = new String("Aabir Datta");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }    
}
