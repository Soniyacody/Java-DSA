import java.util.Stack;

public class stackQues2 {
    public static boolean Validate_Parenthesis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Opening
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } // Closing
            else {
                // Check for String like")))" for this kind of str there is no element in stack
                if (s.isEmpty()) {
                    System.out.print("Reason : Pre Empty");
                    return false;
                }
                // Check for pair
                if ((s.peek() == '{' && ch == '}') || // {}
                        (s.peek() == '[' && ch == ']') || // []
                        (s.peek() == '(' && ch == ')')) // ()
                {
                    s.pop();
                } else {
                    System.out.print("Reason : Invalid pair");
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            System.out.print("Reason : Element remaing");
            return false;
        }
    }

    public static boolean Duplicate_Parentheses(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(' && !s.isEmpty()) {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;// duplicate
                } else {
                    s.pop();// opening pair
                }
            }
            // opening condition
            else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void brute_force_approach() {
        int height[] = { 2, 1, 5, 6, 2, 3 };
        int area = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < height.length - 1; i++) {
            if (height[i] > height[i + 1]) {
                area = height[i];
                max = Math.max(max, area);
            } else if (height[i] <= height[i + 1]) {
                int j = i + 1, k = i - 1;
                int common_right = 0, common_left = 0, common;
                // Right side
                while (height[i] <= height[j] && j < height.length - 1) {
                    common_right = Math.min(height[i], height[j]);
                    j++;
                }
                while (k >= 0 && height[k] >= height[i]) {
                    common_left = Math.min(height[i], height[k]);
                    k--;
                }
                common = Math.min(common_right, common_left);
                area = area + (common * (k + j));
                max = Math.max(max, area);
                System.out.println(i + " : " + j + " : " + area + " : " + max);
            }
        }
        System.out.println("Maximum area : " + max);
    }

    public static void maxArea() {
        int histogram_height[] = { 2, 1, 5, 6, 2, 3 };
        int nsr[] = new int[histogram_height.length];
        int nsl[] = new int[histogram_height.length];
        int maxArea = 0;
        // next smaller left
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < histogram_height.length; i++) {
            while (!s.isEmpty() && histogram_height[s.peek()] >= histogram_height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // next smaller right
        s = new Stack<>();
        for (int i = histogram_height.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && histogram_height[s.peek()] >= histogram_height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = histogram_height.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // current area:width=j-i-1=nsr[i]-nsl[j]-1
        for (int i = 0; i < histogram_height.length; i++) {
            int height = histogram_height[i], width = nsr[i] - nsl[i] - 1;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
            System.out.print(maxArea + " ");
        }
    }

    public static void main(String args[]) {
        // System.out.println("\nString (){}[] is Valid :" +
        // Validate_Parenthesis("(){}[]"));
        // System.out.print("\n Duplicate'((a+b)+c) :" +
        // Duplicate_Parentheses("(a-b)"));
        // brute_force_approach();
        maxArea();
    }
}
