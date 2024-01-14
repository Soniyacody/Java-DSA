import java.util.Arrays;

public class str_prc {
    public static int count_vowel(String user_str) {
        int count = 0;
        for (int i = 0; i < user_str.length(); i++) {
            char ch = user_str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static boolean Anagram_self() {
        String st1 = new String("care");
        String st2 = new String("race");
        st1 = st1.toLowerCase();
        st2 = st2.toLowerCase();
        int count = 0;
        for (int i = 0; i < st1.length(); i++) {
            for (int j = 0; j < st2.length(); j++) {
                if (st1.charAt(i) == st2.charAt(j)) {
                    count++;
                }
            }
        }
        if (count == st1.length()) {
            return true;
        }
        return false;
    }

    public static void Anagram_ppt() {
        String st1 = new String("Earth");
        String st2 = new String("heart");
        // converting into lowercase to avoid upper and lower case issue
        st1 = st1.toLowerCase();
        st2 = st2.toLowerCase();
        // converting string into char array
        char[] st1charArray = st1.toCharArray();
        char[] st2charArray = st2.toCharArray();
        // sort charArray
        Arrays.sort(st1charArray);
        Arrays.sort(st2charArray);
        // if the sorted arrays are identical then they are anagram
        boolean result = Arrays.equals(st1charArray, st2charArray);
        if (result) {
            System.out.println(st1 + " and " + st2 + " are the anagram ");
        } else {
            System.out.print(st1 + " and " + st2 + " are not anagram ");
        }
    }

    public static void main(String args[]) {
        // String user_str = new String("chech vowel");
        // System.out.print(count_vowel(user_str));
        // System.out.print("Anagram or not : " + Anagram_self());
        Anagram_ppt();
    }
}
