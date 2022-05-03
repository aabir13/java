import java.util.*;
public class Practise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>=1; i--) {
            int k=n;
            while(k>0) {
                for(int j=i; j>=1; j--) {
                    System.out.print(k+" ");
                }
                k--;
            }
            System.out.println();
        }
        sc.close();
    }
}