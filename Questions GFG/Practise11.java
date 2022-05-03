import java.util.*;
public class Practise11 {
    static void isJumpingNumber(int n) {
        int i, temp, digits, last=0;
        boolean check;
        for(i=0;i<=n;i++) {
            check=true;
            temp=i;
            digits=temp%10;
            temp/=10;
            while(temp>0) {
                if(Math.abs(digits-temp%10)!=1) {
                    check=false;
                    break;
                }
                digits=temp%10;
                temp/=10;
            }
            if(check){
                last=i;
            }
        }
        System.out.println(last);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isJumpingNumber(n);
        sc.close();
    }
}
