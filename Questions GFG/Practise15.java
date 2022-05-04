import java.util.*;
public class Practise15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        int a=ar[0];
        int i=1, gcd=0;
        while(i<=a) {
            int c=0;
            for(int j=0; j<n; j++) {
                if(ar[j]%i == 0) {
                    c++;
                }
            }
            if(c==n) {
                gcd=i;
            }
            i++;
        }
        System.out.println("GCD of the array: "+gcd);
        sc.close();
    }
}
