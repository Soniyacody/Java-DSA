import java.util.*;

public class alreadybasic {
    public static void main(String args[]) {
        System.out.print("Enter numbe to check ->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        /*
         * int sum = 0,num=5;
         * int count = 1;
         * while (count <= n) {
         * System.out.print(" " + sum);
         * sum += count;
         * count++;
         * }
         * System.out.println(" ");1
         * System.out.println("Sum ->" + sum);
         * sc.close();
         */
        /*
         * int lastDigit, reverse = 0;
         * while (num > 0) {
         * lastDigit = num % 10;
         * reverse = reverse * 10 + lastDigit;
         * num = num / 10;
         * }
         * System.out.print("reverse of given number ->" + reverse);
         */
        int i = 2;
        int flag = 0;
        for (i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag += 1;
                break;
            }
        }
        if (flag > 0) {
            System.out.print("number is not prime : " + n);
        } else {
            System.out.print("number is prime : " + n);
        }
        sc.close();
    }
}
