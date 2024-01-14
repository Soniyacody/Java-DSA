import java.util.*;

public class product_of_a_b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*
         * float a=sc.nextFloat();
         * float b= sc.nextFloat();
         * float mul=a*b;
         * System.out.println(mul);
         */
        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.print(area);
        sc.close();
    }
}
