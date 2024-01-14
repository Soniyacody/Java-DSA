import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class quque_ques {
    public static void first_repeating_char(String str) {
        // Make frequency arrayy
        int freq_arr[] = new int[26];
        // Make Queue to track visited elements
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq_arr[ch - 'a']++;
            while (!q.isEmpty() && freq_arr[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void interleave_2half_of_queque(Queue<Integer> q) {
        Queue<Integer> q2 = new LinkedList<>();
        int size = q.size() / 2;
        // int i = 0, j = size;
        while (size > 0) {
            q2.add(q.remove());
            size--;
        }
        while (!q2.isEmpty()) {
            q.add(q2.remove());
            q.add(q.remove());
        }
    }

    public static void Queue_reversal(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String args[]) {
        // first_repeating_char("abaccxb");
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        // interleave_2half_of_queque(q);
        Queue_reversal(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
