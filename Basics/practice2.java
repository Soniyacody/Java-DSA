import java.util.*;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year" + year);

                }
            }
            System.out.print("leap year" + year);
        } else {
            System.out.println("not a leap year" + year);
        }
        sc.close();
    }
}