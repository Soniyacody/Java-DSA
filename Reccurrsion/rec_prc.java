public class rec_prc {
    public static String prc(String arr[], int num, String output) {
        // Base case
        if (num == 0) {
            System.out.println(output);
            return output;
        }
        int temp = num % 10;
        output = output + (arr[temp]);
        num = num / 10;
        return prc(arr, num, output + " ");
    }

    public static int rev(int n) {
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            int temp = n % 10;
            ans = ans * 10 + temp;
            n = n / 10;
        }
        return ans;
    }

    // -----------XXXXX----------
    public static int substring(String S, int count, int n, int s, int e) {
        // base case
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        substring(S, count, n - 1, s - 1, e);
        char start = S.charAt(s);
        substring(S, count, n - 1, s, e - 1);
        char end = S.charAt(e);
        if (start == end) {
            System.out.println(start + " " + end);
            count = count + 1;
        }
        System.out.println(count);
        return count;
    }

    // ----------------XXXXXXXXXX--------------
    public static void substring_loop(String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            char start = S.charAt(i);
            StringBuilder substr = new StringBuilder("");
            for (int j = 0; j <= i; j++) {
                char end = S.charAt(j);
                substr.append(S.charAt(j));
                if (start == end) {
                    System.out.println(substr);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void dec_to_binary() {
        int num = 10;
        StringBuilder answer;
        StringBuilder ans = new StringBuilder("");
        int temp;
        while (num > 0) {
            temp = num % 2;
            System.out.print(temp + " ");
            ans = ans.append(temp);
            num = num / 2;
        }
        answer = ans.reverse();
        System.out.println("Binary format ->" + answer);
    }

    // -------------X X X X X X XX X-------------
    public static void main(String[] args) {
        /*
         * Q.2 to convert number into english letter
         * String arr[] = { "zero", "one", "two", "three", "four", "five", "six",
         * "seven", "eight", "nine" };
         * int num = rev(1947);
         * prc(arr, num, new String(" "));
         */
        /*
         * String S = "abcab";
         * int count = 0;
         * int n = S.length() - 1;
         * substring(S, count, n, S.length() - 1, S.length() - 1);
         * // substring_loop(S);
         */
        dec_to_binary();
    }
}
