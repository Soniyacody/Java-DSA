public class bcktrck_prc {
    public static void bcktrck_arr(int num[], int i) {
        if (i == num.length) {
            System.out.println("\nAfer Backtrack");
            return;
        }
        num[i] = i;
        System.out.print(num[i] + " ");
        bcktrck_arr(num, i + 1);
        num[i] = num[i] - 2;
        System.out.print(num[i] + " ");
    }

    public static void subset1(String mastr, String str, int i) {
        if (i == mastr.length()) {
            if (str == "") {
                System.out.print("Null");
            }
            System.out.print(str + "  ");
            return;
        }
        // Yes wali choice
        subset1(mastr, str + mastr.charAt(i), i + 1);
        // System.out.print(str + " ");
        // No wali choice
        subset1(mastr, str, i + 1);
    }

    public static void permutation(String str, String ans) {
        // Base case
        if (str.length() == 0) {
            System.out.print(ans + "  ");
            return;
        }
        // Recurrsion
        for (int j = 0; j < str.length(); j++) {
            char curr = str.charAt(j);
            // Make subset of string
            String Newstr = str.substring(0, j) + str.substring(j + 1);
            permutation(Newstr, ans + curr);
        }
    }

    public static void main(String args[]) {
        // int num[] = new int[5];
        // bcktrck_arr(num, 0);
        // subset1("abc", "", 0);
        // permutation("abc", "");

    }
}
