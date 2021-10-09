
/*Code to calculate the count first repeating element in the array.
The element should occurs more than once and the index of its first occurrence should be the smallest.
Sample Input 1:
7
1 5 3 4 3 5 6
Sample Output 1:
2

Sample Input 2:
4
1 2 3 4
Sample Ouput 2:
-1
*/
import java.util.*;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = 0;
            for (int j = 0; j < n; j++) {
                if (ar[i] == ar[j])
                    c++;
            }
            if (c > 1)
                break;
        }
        System.out.println("Count of first repeating element: " + c);
        sc.close();
    }
}
