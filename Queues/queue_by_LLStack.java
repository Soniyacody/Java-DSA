import java.util.*;

public class queue_by_LLStack {
    // static class Node {
    // int data;
    // Node next;

    // Node(int data) {
    // this.data = data;
    // this.next = null;
    // }
    // }

    // public static Node head;
    // public static Node tail;

    // public static boolean isEmpty() {
    // return head == null && tail == null;
    // }

    // public void add(int data) {
    // Node newnode = new Node(data);
    // if (head == null) {
    // head = tail = newnode;
    // return;
    // }
    // tail.next = newnode;
    // tail = newnode;
    // }

    // public int remove() {
    // if (isEmpty()) {
    // System.out.println("Stack is empty");
    // return -1;
    // }
    // int front = head.data;
    // // Single element
    // if (tail == head) {
    // tail = head = null;
    // } else {
    // head = head.next;
    // }
    // return front;
    // }

    // public int peek() {
    // if (isEmpty()) {
    // System.out.println("Empty Queue");
    // return -1;
    // }
    // return head.data;
    // }

    // ------2-----------------------------
    // static class Queue {
    // static Stack<Integer> s1 = new Stack<>();
    // static Stack<Integer> s2 = new Stack<>();
    // public boolean isEmpty() {
    // return s1.isEmpty();
    // }
    // // add
    // public void add(int data) {
    // while (!s1.isEmpty()) {
    // s2.push(s1.pop());
    // }
    // s1.push(data);
    // while (!s2.isEmpty()) {
    // s1.push(s2.pop());
    // }
    // }
    // // remove
    // public int remove() {
    // if (isEmpty()) {
    // System.out.println("Queue is empty");
    // return -1;
    // }
    // return s1.pop();
    // }
    // // peek
    // public int peek() {
    // if (isEmpty()) {
    // System.out.println("Queue is empty");
    // return -1;
    // }
    // return s1.peek();
    // }
    // }
    static class Stack1 {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void add(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else if (!q2.isEmpty()) {
                q2.add(data);
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;
            // case-1 element in q1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {
                // case2-element in q2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;
            // case-1 element in q1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                // case2-element in q2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String args[]) {
        // queue_by_LLStack q = new queue_by_LLStack();
        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // while (!q.isEmpty()) {
        // System.out.println(q.remove());
        // }
        // Queue q = new Queue();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // while (!q.isEmpty()) {
        // System.out.println(q.remove());
        // }
        // Stack1 s = new Stack1();
        // s.add(1);
        // s.add(2);
        // s.add(3);
        // while (!s.isEmpty()) {
        //     System.out.println(s.remove());
        // }
    }
}