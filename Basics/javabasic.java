import java.util.*;

public class javabasic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax = 0;
        if (income < 50000) {
            tax = income * 0;
            System.out.print("Tax :" + tax);
        } else if (income > 50000 && income < 100000) {
            tax = (int) (income * 0.2);
            System.out.print("Tax :" + tax);
        } else {
            tax = (int) (0.3 * income);
            System.out.print("Tax :" + tax);
            sc.close();
        }
    }
}