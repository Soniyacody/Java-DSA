import java.util.*;

public class basic {
    public static void Product(int num1, int num2) {
        int product = num1 * num2;
        System.out.println("product of two number : " + product);
    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomialFact(int num, int r_no) {
        int n = fact(num);
        int r = fact(r_no);
        int diff = fact(num - r_no);
        int bino = n / (r * diff);
        return bino;
    }

    public static int PrintSum(int num1, int num2) {// formal parameter or parameter used druing function definition
        int sum = num1 + num2;
        return sum;
    }

    public static int PrintSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    public static void main(String args[]) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("sum of two number : " + PrintSum(a, b));// actual parameter or argument
        // during a function call;
        // Product(a, b);
        // System.out.print("factorial of number : " + fact(a));
        // System.out.print("Binomial coefficient : " + binomialFact(a, b));
        System.out.print("Sum of three number : " + PrintSum(a, b, c));
        sc.close();
    }
}