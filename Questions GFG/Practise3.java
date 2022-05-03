import java.util.*;
public class Practise3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int n = sc.nextInt();
        int d = a2-a1;
        System.out.println(a1+(n-1)*d);
        sc.close();
    }
}
