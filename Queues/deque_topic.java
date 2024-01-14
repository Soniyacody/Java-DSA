import java.util.*;

public class deque_topic {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    static class Queue {
        Deque<Integer> d2 = new LinkedList<>();

        public void add(int data) {
            d2.addLast(data);
        }

        public int remove() {
            return d2.removeFirst();
        }

        public int peek() {
            return d2.getFirst();
        }

        public boolean isEmpty() {
            return d2.isEmpty();
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.pop() + " ");
        }
        Queue q = new Queue();
        q.add(4);
        q.add(5);
        q.add(6);
        while (!q.isEmpty()) {
            System.out.println(q.remove() + " ");
        }
    }
}
