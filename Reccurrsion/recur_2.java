public class recur_2 {
    public static void RemoveDuplicate(int idx, String str, boolean map[], StringBuilder output) {
        // base case
        if (idx == str.length()) {
            System.out.println("Output String  ->  " + output);
            return;
        }
        // kaam ya work
        char Curr_char = str.charAt(idx);
        if (map[Curr_char - 'a'] == true) {
            // duplicate character repeated one skip to add move to next iteration
            RemoveDuplicate(idx + 1, str, map, output);
        } else {
            map[Curr_char - 'a'] = true;
            RemoveDuplicate(idx + 1, str, map, output.append(Curr_char));
        }
    }

    public static int FriendPairing_1(int n) {
        // BaseCase
        if (n == 1 || n == 2) {
            return n;
        }
        // kaam ya work--->>choices
        // can be single
        int fnm1 = FriendPairing_1(n - 1);
        // can be pair
        int fnm2 = FriendPairing_1(n - 2);
        int pairway = (n - 1) * fnm2;
        int totalWays = fnm1 + pairway;
        return totalWays;
    }

    public static void BinaryString(int n, int lastplace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kam
        BinaryString(n - 1, 0, str + "0");
        if (lastplace == 0) {
            BinaryString(n - 1, 1, str + "1");
        }
    }

    public static int FriendPairing_2(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }
        return FriendPairing_2(n - 1) + (n - 1) * FriendPairing_1(n - 2);
    }

    public static void main(String[] args) {
        // String str = "aappppnacolllegex";
        // RemoveDuplicate(0, str, new boolean[26], new StringBuilder(""));
        System.out.println("Friend can be pair ->> " + FriendPairing_1(3));
        // BinaryString(4, 0, new String(""));
    }
}
