public class Str_l2 {
    public static int is_Palindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // condition for not a palindrome
                return -1;
            }
        }
        System.out.print("String is palindrome :" + str);
        return 1;
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'S') {// south
                y--;
            } else if (dir == 'N') {// north
                y++;
            } else if (dir == 'W') {// west
                x--;
            } else if (dir == 'E') {// east
                x++;
            }
        }
        int x2 = x * x, y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void sub_string(String s1, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += s1.charAt(i);
        }
        System.out.print("Substring : " + substr);
    }

    public static void largest_string() {
        String fruit[] = { "apple", "mango", "banana" };
        String largest = fruit[0];
        for (int i = 0; i < fruit.length; i++) {
            if (largest.compareToIgnoreCase(fruit[i]) < 0) {
                largest = fruit[i];
            }
        }
        System.out.print("Largest String :" + largest);
    }

    public static void main(String args[]) {
        // String str = "racecar";
        // is_Palindrome(str);
        // String path = "WNEENESENNN";
        // System.out.print(getShortestPath(path));
        // String s1 = "HelloWorld";
        // sub_string(s1, 0, 5);
        // System.out.println(s1.substring(0, 5));
        // String s2 = "Tony";
        // String s3 = new String("Tony");
        /*
         * if (s1 == s2) { // it compares intering
         * System.out.println("Strings are equal");
         * }
         * if (s2 == s3) { // s3 stored at differen at location
         * System.out.println("Strings are equal");
         * if (s2.equals(s3)) { // compares values
         * System.out.println("Equals");
         * }
         */
        largest_string();
    }
}
