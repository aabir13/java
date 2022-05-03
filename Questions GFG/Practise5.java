import java.util.*;
public class Practise5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a = 0, b = 0;
        int i=n-1, j=n+1;
        while(i>0) {
            if(i%m == 0) {
                a=i;
                break;
            }
            i--;
        }
        while(j>0) {
            if(j%m == 0) {
                b=j;
                break;
            }
            j++;
        }
        if(Math.abs(a-n)<Math.abs(b-n)){
            System.out.println(a);
        }
        else if(Math.abs(a-n) == Math.abs(b-n)) {
            System.out.println(Math.abs(a)>Math.abs(b)?a:b);
        }
        else {
            System.out.println(b);
        }
        sc.close();
    }
}
