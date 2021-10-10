
/*Code to create an array of elements which either are not divisible by 7 or do not contain 7 in them
User gives the input of an index and it should print the value at that index from the created array
Sample Input:
18
Sample Output:
23
*/
import java.util.*;

public class ExcludingSeven {
    static boolean hasSeven(int n) {
        while (n > 0) {
            int temp = n % 10;
            if (temp == 7)
                return true;
            n = n / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n + 1];
        int i = 0, j = 1;
        while (i < n + 1) {
            if (hasSeven(j) || j % 7 == 0)
                j++;
            else {
                ar[i] = j;
                i++;
                j++;
            }
        }
        System.out.println("Desired Array: " + Arrays.toString(ar));
        System.out.println("Element in " + n + "th term of the desired array is: " + ar[n]);
        sc.close();
    }
}