import java.util.*;
public class Practise9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=sc.nextInt();
        int pow = (int)Math.pow(a,b);
        int i=1, ans=0;
        while(i<=k) {
            ans=pow%10;
            pow /= 10;
            i++;
        }
        System.out.println(ans);
        sc.close();
    }
}
