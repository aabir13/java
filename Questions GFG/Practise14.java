import java.util.*;
public class Practise14 {
    static int gcd(int a, int b) {
        int gcd=0;
        for(int i=1; i<=a && i<=b; i++) {
            if(a%i==0 && b%i==0) {
                gcd=i;
            }
        }
        return gcd;
    }
    static int lcm(int a, int b) {
        int lcm = (a/gcd(a,b))*b;
        return lcm;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int den1=sc.nextInt();
        int num2=sc.nextInt();
        int den2=sc.nextInt();
        int den=lcm(den1,den2);
        int num=((den/den1)*num1)+((den/den2)*num2);
        System.out.println(num+"/"+den);
        sc.close();
    }
}
