//Code to check whether the entered string falls under the condition of Anagrams

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        int c=0, c1=0, c2=0;
        a=a.toUpperCase();
        b=b.toUpperCase();
        for(int k=0; k<a.length(); k++)
        {
            char ch = a.charAt(k);
            ch = Character.toUpperCase(ch);
            for(int i=0; i<a.length(); i++)
            {
                if(ch==a.charAt(i))
                {
                    c1++;
                }
                if(ch==b.charAt(i))
                {
                    c2++;
                }
            }
            if(c1 == c2)
            {
                c++;
            }
            c1 = 0; 
            c2 = 0;
        }
        if(c == a.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}



