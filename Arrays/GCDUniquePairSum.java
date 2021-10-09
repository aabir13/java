
/*Code to find the sum of gcd of all unique pairs in the array.
Sample Input:
3
1 2 3
Sample Output:
3
*/
import java.util.*;

public class GCDUniquePairSum {
    static int gcd(int a, int b) {
        int val = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                val = i;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = ar[i];
                int b = ar[j];
                sum += gcd(a, b);
            }
        }
        System.out.println("Sum of gcd of all unique pairs in an array: " + sum);
        sc.close();
    }
}