// public class practice_question {
// public static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static Node head;
// public static Node tail;

// public void addFirst(int data) {
// Node newnode = new Node(data);
// if (head == null) {
// head = tail = newnode;
// return;
// }
// newnode.next = head;
// head = newnode;
// }

// public void printLL(Node head) {
// Node temp = head;
// System.out.println("\n");
// while (temp != null) {
// System.out.print(temp.data + "->");
// temp = temp.next;
// }
// System.out.print("null\n");
// }

// public void Delete_n_Nodes(int m, int n) {
// Node temp = head;
// int counter = 0, delete = 1;
// while (temp != null) {
// counter++;
// Node to_delete = null;
// Node track = temp;
// if (counter == m) {
// while (delete <= n && temp.next != null) {
// to_delete = temp;
// temp = temp.next;
// to_delete.next = null;
// delete++;
// }
// track.next = temp.next;
// counter = 0;
// delete = 1;
// }
// System.out.print(temp.data + "->");
// temp = temp.next;
// }
// }

// public void swap_nodes(int x, int y) {
// Node temp = head;
// int counter = 0;
// Node node1 = new Node(0), node2 = new Node(0), swap = new Node(0);
// while (temp != null) {
// counter++;
// if (counter == x) {
// node1 = temp;
// }
// if (counter == y) {
// node2 = temp;
// break;
// }
// temp = temp.next;
// }
// swap.data = node1.data;
// node1.data = node2.data;
// node2.data = swap.data;
// System.out.println(node2.data + ":" + node1.data);
// }

// public void leetcode_swap_nodes(int k) {
// Node temp = head;
// Node node1 = new Node(0), node2 = new Node(0), swap = new Node(0);
// int size = 0, counter = 0;
// while (temp != null) {
// temp = temp.next;
// size++;
// }
// int key2 = (size - k) + 1;
// temp = head;
// while (temp != null) {
// counter++;
// if (counter == k) {
// node1 = temp;
// }
// if (counter == key2) {
// node2 = temp;
// }
// temp = temp.next;
// }
// swap.data = node1.data;
// node1.data = node2.data;
// node2.data = swap.data;
// }

// // public Node leetcode_odd_N_even() {
// // Node temp=head,oddList=head,evenList=head.next,oldlist_tail;
// // int counter=0;
// // while (temp!=null) {
// // if(counter%2==0){
// // evenList.next=temp;
// // }else{
// // oddList.next=temp;
// // }
// // }
// // }
// public void Leetcode_Odd_Even() {
// Node EvenLL = new Node(-1);
// Node temp = head, temp2 = EvenLL;
// int idx = 1;
// while (temp != null) {
// Node Even_Node = temp.next;
// if ((idx % 2 != 0) && temp.next == null) {
// break;
// }
// // System.out.println(temp.data + " : " + temp.next.data + " -> " +
// EvenLL.data
// // + "-" + Even_Node.data);
// temp.next = temp.next.next;
// temp2.next = Even_Node;
// Even_Node.next = null;
// temp2 = temp2.next;
// temp = temp.next;
// }
// // temp = EvenLL;
// // while (temp.next != null) {
// // System.out.print(temp.data + " ");
// // temp = temp.next;
// // }
// temp = head;
// while (temp.next != null) {
// // System.out.print(temp.data + " ");
// temp = temp.next;
// }
// temp.next = EvenLL.next;
// }

// public static Node removeElements(Node head, int val) {
// if (head == null && (head.next == null && head.data == val)) {
// return null;
// }
// Node temp = head.next, prev = head;
// if (temp == head && temp.data == val) {
// head = head.next;
// }
// while (temp != null) {
// if (temp.data == val) {
// prev.next = temp.next;
// System.out.println(prev.data + " " + temp.data + " " + prev.next.data);
// prev = temp;
// temp = temp.next;
// }
// prev = temp;

// temp = temp.next;
// }
// return head;
// }

// public static void main(String args[]) {
// practice_question ll = new practice_question();
// // ll.addFirst(10);
// // ll.addFirst(9);
// // ll.addFirst(8);
// // ll.addFirst(7);
// ll.addFirst(6);
// ll.addFirst(2);
// ll.addFirst(2);
// ll.addFirst(3);
// ll.addFirst(2);
// ll.addFirst(1);
// ll.printLL(head);
// // ll.Delete_n_Nodes(4, 4);
// // ll.swap_nodes(2, 4);
// // ll.leetcode_swap_nodes(2);
// // ll.Leetcode_Odd_Even();
// removeElements(head, 2);
// ll.printLL(head);
// }
// }
