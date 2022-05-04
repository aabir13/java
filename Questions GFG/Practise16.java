import java.util.*;
public class Practise16 {
    static int fact(int n) {
        if(n==1) {
            return n;
        }
        else {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Factorial of the number: "+fact(n));
        sc.close();
    }
}