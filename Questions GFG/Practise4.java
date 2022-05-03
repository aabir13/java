import java.util.*;
public class Practise4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=sc.nextInt();
        int n=sc.nextInt();
        int pow = (int)Math.pow(r,(n-1));
        System.out.println(a*pow);
        sc.close();
    }
}
