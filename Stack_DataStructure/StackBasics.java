
// import java.util.ArrayList;
import java.util.*;

public class StackBasics {
    // static class StackAL {
    // static ArrayList<Integer> list = new ArrayList<>();
    // public boolean isEmpty() {
    // return list.size() == 0;
    // }
    // // Push functtion
    // public void push(int data) {
    // list.add(data);
    // }
    // // pop function
    // public int pop() {
    // if (isEmpty()) {
    // return -1;
    // }
    // int top = list.get(list.size() - 1);
    // list.remove(list.size() - 1);
    // // System.out.println(top);
    // return top;
    // }
    // // peek function
    // public int peek() {
    // if (isEmpty()) {
    // return -1;
    // }
    // int top = list.get(list.size() - 1);
    // // System.out.print(top + " ");
    // return top;
    // }
    // }

    // static class Node {
    // int data;
    // Node next;
    // Node(int data) {
    // this.data = data;
    // this.next = null;
    // }
    // }

    // public static class StackLL {
    // static Node head = null;
    // public boolean isEmpty() {
    // return head == null;
    // }
    // public void push(int data) {
    // Node newnode = new Node(data);
    // if (head == null) {
    // head = newnode;
    // return;
    // }
    // newnode.next = head;
    // head = newnode;
    // }
    // public int pop() {
    // if (isEmpty()) {
    // return -1;
    // }
    // int top = head.data;
    // head = head.next;
    // // System.out.println(head.data + " ");
    // return top;
    // }
    // public int peek() {
    // if (isEmpty()) {
    // return -1;
    // }
    // return head.data;
    // }
    // }

    public static void main(String args[]) {
        // StackAL s = new StackAL();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek() + " ");
            s.pop();
        }
        // StackLL s1 = new StackLL();
        // s1.push(1);
        // s1.push(3);
        // s1.push(2);
        // while (!s1.isEmpty()) {
        // System.out.print(s1.peek() + " ");
        // s1.pop();
        // }

    }

}