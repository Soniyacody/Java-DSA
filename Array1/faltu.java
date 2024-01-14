
public class faltu {
    public static void search(int arr[], int key, int idx) {
        // Base case
        if (idx == arr.length) {
            return;
        }
        // kaam
        if (arr[idx] == key) {
            System.out.println(arr[idx] + " -> " + idx);
        }
        search(arr, key, idx + 1);
    }

    public static void num_2_string(int num, String word[], String ans) {
        // Base case
        if (num == 0) {
            System.out.println("End ->" + ans);
            return;
            // return ans;
        }
        ans = word[num % 10] + "  " + ans;
        System.out.print(num % 10 + "  ->");
        num_2_string(num / 10, word, ans);
        // return ans;
    }

    public static void substring(String str, int idx, String ans) {
        // Base case
        if (idx == 0) {
            // System.out.println(str.charAt(idx) + ans);
            return;
        }
        substring(str, idx - 1, str.charAt(idx) + ans);
        System.out.println(ans);
    }

    public static void main(String args[]) {
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // search(arr, 2, 0);
        // String word[] = { "zero", "one", "two", "three", "four", "five", "six",
        // "seven", "eight", "nine" };
        // num_2_string(1007, word, "");
        String str = "abcdef";
        substring(str, str.length() - 1, new String(""));
    }
}
