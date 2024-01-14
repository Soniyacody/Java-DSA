import java.util.*;

public class practice4 {
    public static int avg(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }

    public static boolean checkEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void Palindrome(int num) {
        int rem, ans = 0, temp = num;
        while (temp > 0) {
            rem = temp % 10;
            ans = ans * 10 + rem;
            // System.out.print(ans + " ");
            temp = temp / 10;
        }
        if (num == ans) {
            System.out.println("Number is palindrome :" + num);
        } else {
            System.out.println("Number is not a palindrome :" + num);
        }
    }

    public static void IntSum() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rem, sum = 0;
        while (number > 0) {
            rem = number % 10;
            number /= 10;
            sum += rem;
        }
        System.out.print("Sum of digit of number : " + sum);
        sc.close();
    }

    public static void main(String args[]) {
        // int a = 171;
        // int b = 3, c = 3;
        // System.out.print("average of 3number : " + avg(a,b,c));
        // System.out.print(checkEven(a));
        System.out.print("\nmaths.abs -> " + Math.abs(-4));
        System.out.print("\nmaths.pow -> " + Math.pow(4, 2));
        System.out.print("\nmaths.min -> " + Math.min(5, 4));
        // System.out.print("\nmaths.avg -> " + Math.avg(4, 4, 4, 4));
        // Palindrome(a);
        IntSum();
    }
}
