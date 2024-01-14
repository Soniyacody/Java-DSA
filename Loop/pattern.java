public class pattern {
    public static void main(String args[]) {
        // program to print star pyramid
        /*
         * for (int i = 10; i > 0; i--) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print(" * ");
         * }
         * System.out.println();
         */
        // program to print number pyramid
        /*
         * for (int i = 0; i <= 4; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print(j + " ");
         * }
         * System.out.println();
         * }
         */
        int n = 4;
        char ch = 'A';
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
