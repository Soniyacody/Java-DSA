
import java.util.Scanner;

class s_l1 {
    public static void main(String[] args) {
        // declaration of string in java
        // String str = "abc";
        // String str2 = new String("XYZ");
        Scanner sc = new Scanner(System.in);
        String f_name;
        f_name = sc.next(); // nextline function take input as a whole line or even paragraph
        String l_name = sc.next();
        String fullname = f_name + " " + l_name;
        System.out.print("Full name -> " + fullname);

        sc.close();
    }
}
