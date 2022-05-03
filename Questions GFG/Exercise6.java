import java.util.*;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num = n;
        int sum=0;
        while(num>0) {
            int temp = num%10;
            sum += (int)Math.pow(temp,3);
            num /= 10;
        }
        if(sum == n) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }
        sc.close();
    }
}