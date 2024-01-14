
import java.util.*;

public class practice1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*
         * //Q.1
         * int a=sc.nextInt();
         * int b=sc.nextInt();
         * int c=sc.nextInt();
         * float avg=(a+b+c)/3;
         * System.out.print("average :");
         * System.out.print(avg);
         */
        /*
         * //Q/2
         * int s=sc.nextInt();
         * int area=s*s;
         * System.out.print("Area of square");
         * System.out.print(area);
         */
        // Q.3
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float coast = pen + pencil + eraser;
        System.out.print("coast");
        System.out.print(coast);
        float gst = (18 * coast) / 100;
        float total = gst + coast;
        System.out.println("price of pencil,pen and earser is:");
        System.out.println(total);

        sc.close();
    }
}
