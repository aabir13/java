import java.util.*;
public class FactorialDemo {
    public static void main(String[] args) {
        ComplexFunction factorial = new ComplexFunction();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial.calculateFactorial(n);
        System.out.println("Factorial: "+result);
        sc.close();
    }
}
