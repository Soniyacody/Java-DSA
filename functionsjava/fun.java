import java.util.*;

public class fun {
    public static int binaryToDecimal(int num) {
        int rem = 0, ans = 0, pow = 1;
        while (num > 0) {
            rem = num % 10;
            num /= 10;
            ans = ans + (rem * pow);
            pow *= 2;
        }
        return ans;
    }

    public static void DecimalToBinary(int num) {
        int rem, ans = 0, binary = 1;
        while (num > 0) {
            if (num % 2 == 0) {
                ans = ans * 10 + 0;
            } else {
                ans = ans * 10 + 1;
            }
            num /= 2;
        }
        System.out.print(ans);
        while (num > 0) {
            rem = ans % 10;
            binary = binary * 10 + rem;
            ans /= 10;
        }
        System.out.print("Binary form : " + binary);
    }

    public static void main(String args[]) {
        System.out.print("Enter :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // System.out.print("Decimal form of number : " + binaryToDecimal(num));
        DecimalToBinary(num);
        sc.close();
    }
}
