import java.util.*;

public class practice3 {
    public static void main(String args[]) {
        System.out.print("Enter your choice :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1, sumEven = 0, sumOdd = 0;
        while (i <= num) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        }
        System.out.print("sum of odd number : " + sumOdd);
        System.out.print("sum of even number : " + sumEven);
        sc.close();
    }
}
