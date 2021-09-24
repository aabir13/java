//Code to understand the immutabilty of strings and concatenation process in strings
public class concatenation 
{
    public static void main(String[] args)
    {
        String fn="Aabir ";
        String ln="Datta";
        fn.concat(ln); //Strings are immutable hence output will just be the fn string
        System.out.println(fn);
        fn = fn.concat(ln);
        System.out.println(fn);
        String s1 = new String("aabir");
        String s2 = new String("datta");
        String s=String.join(" ",s1,s2);
        System.out.println(s);
    }
}
