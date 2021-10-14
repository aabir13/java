
/*Code to find whether by deleting at most one character from the string, the string is palindrome.
If palindrome return true, else return false.
Sample Input:
bopb
Sample Output:
True
*/
import java.util.*;

public class delPalindrome {
    static boolean isPalindrome(String st) {
        String s = "";
        for (int i = st.length() - 1; i >= 0; i--)
            s += st.charAt(i);
        if (s.equals(st))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int l = st.length();
        int c = 0, count = 0;
        if (isPalindrome(st))
            System.out.println("True");
        else {
            while (c < l) {
                String s = "";
                for (int i = 0; i < l; i++) {
                    if (i != c)
                        s = s + st.charAt(i);
                }
                if (isPalindrome(s))
                    count++;
                c++;
            }
            if (count > 0)
                System.out.println("True");
            else
                System.out.println("False");
        }
        sc.close();
    }
}