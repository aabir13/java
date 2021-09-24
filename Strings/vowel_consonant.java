import java.util.*;
public class vowel_consonant 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        char c=Character.toUpperCase(ch);
        switch(c)
        {
            case 'A': System.out.println("Entered character is a vowel"); break;
            case 'E': System.out.println("Entered character is a vowel"); break;
            case 'I': System.out.println("Entered character is a vowel"); break;
            case 'O': System.out.println("Entered character is a vowel"); break;
            case 'U': System.out.println("Entered character is a vowel"); break;
            default: System.out.println("Entered character is a consonant"); break;
        }
        sc.close();
    }
}