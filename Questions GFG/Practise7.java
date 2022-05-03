import java.util.*;
public class Practise7 {
    static boolean isPalindrome(int n) {
        int num=n;
        int rev=0;
        while(num>0) {
            rev = rev*10 + (num%10);
            num /= 10;
        }
        if(n==rev){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        while(num>0) {
            sum += num%10;
            num /= 10;
        }
        if(isPalindrome(sum)) {
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not a Palindrome Number");
        }
        sc.close();
    }
}
