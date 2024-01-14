import java.util.Stack;

//output:"zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef"
public class Question_Prac {
    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ']') {
                while (stack.peek() != '[') {
                    str.append(stack.pop());
                }
                String tmp = str.toString();
                stack.pop();
                int count = 0;
                char ch = stack.peek();
                int x = 0;
                while (!stack.empty() && ch - '0' >= 0 && ch - '0' <= 9) {
                    x = (stack.pop() - '0') * (int) Math.pow(10, count) + x;
                    if (stack.empty())
                        break;
                    ch = stack.peek();
                    count++;
                }
                for (int j = 0; j < x; j++) {
                    for (int k = tmp.length() - 1; k >= 0; k--) {
                        stack.push(tmp.charAt(k));
                    }
                }
            } else {
                stack.push(s.charAt(i));

            }
            str.delete(0, str.length());
        }
        while (!stack.empty()) {
            str.append(stack.pop());
        }
        return str.reverse().toString();

    }

    public static void Decode_String() {
        String s = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef";
        StringBuilder decode = new StringBuilder();
        StringBuilder start_temp = new StringBuilder();
        int count = -1, temp_counter = 0;
        Stack<Character> stk = new Stack<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(Character.isDigit(ch)) && i == 0) {
                int k = 0;
                while (k < s.length() - 1 && s.charAt(k + 1) != '[') {
                    start_temp = start_temp.append(s.charAt(k));
                    k++;
                }
                i = k - 1;
            }

            // Closing
            else if (ch == ']') {
                while (!stk.isEmpty() && stk.peek() != '[') {
                    temp = temp.append(stk.pop());
                    temp_counter++;
                }
                stk.pop();
                temp_counter++;
                temp = temp.reverse();
                if (!stk.isEmpty()) {
                    StringBuilder number = new StringBuilder();
                    while (!stk.isEmpty() && Character.isDigit(stk.peek())) {
                        number = number.append(stk.peek());
                        stk.pop();
                        temp_counter++;
                    }
                    number = number.reverse();
                    count = Integer.parseInt(number.toString());
                    int j = 0;
                    while (j < count) {
                        decode = decode.append(temp);
                        j++;
                    }
                    // System.out.print(count + " -> ");
                    // System.out.print(decode + " </ ");
                    if (!stk.isEmpty()) {
                        // System.out.print(stk.peek() + ":\n");
                    }
                    if ((i < s.length() - 1 && s.charAt(i + 1) == ']') ||
                            (i >= 0 && (s.charAt(i - temp_counter) == '['))) {
                        temp = new StringBuilder(decode);
                        decode = new StringBuilder();
                        System.out.println(temp + ": temp " + i + " -> " + s.charAt(i - temp_counter));
                    } else {
                        temp = new StringBuilder();
                    }
                } else {
                    decode = decode.append(temp);
                    temp = new StringBuilder();
                }
            } else {
                stk.push(ch);
            }
        }
        temp = new StringBuilder();
        // decode = start_temp + decode;
        decode = decode.insert(0, start_temp);
        while (!stk.isEmpty()) {
            temp = temp.append(stk.pop());
        }
        temp = temp.reverse();
        decode = decode.append(temp);
        // String answer = decode.toString();
        System.out.println("Decoded : " + decode);
    }

    public static void main(String args[]) {
        // Decode_String();
        decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef");
        // Decode_String1("3[b2[v]]L");
    }
}
