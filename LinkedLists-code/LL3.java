public class LL3 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;// To get last element of left half as mid
        while (fast != null && fast.next != null) {
            fast = fast.next.next;// +2
            slow = slow.next;// +1
        }
        return slow;
    }

    private Node merge(Node left_head, Node right_head) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (left_head != null && right_head != null) {
            if (left_head.data < right_head.data) {
                temp.next = left_head;
                left_head = left_head.next;
                temp = temp.next;
            } else {
                temp.next = right_head;
                right_head = right_head.next;
                temp = temp.next;
            }
        }
        while (left_head != null) {
            // Left part is remaining
            temp.next = left_head;
            left_head = left_head.next;
            temp = temp.next;
        }
        while (right_head != null) {
            // right part is remaining
            temp.next = right_head;
            right_head = right_head.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);// left half
        Node newRight = mergeSort(rightHead);// right half
        // merge
        return merge(newLeft, newRight);
    }

    public void add_first(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void printLL(Node head) {
        Node temp = head;
        System.out.println();
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    // ZigZag LL
    public void ZigZag() {
        // Find mid
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node mid = slow;
        // Reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        // Merge alternate
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }
    }

    public static void main(String args[]) {
        LL3 ll = new LL3();
        ll.add_first(1);
        ll.add_first(2);
        ll.add_first(3);
        ll.add_first(4);
        ll.add_first(5);
        ll.add_first(6);
        ll.printLL(head);
        head = ll.mergeSort(head);
        ll.printLL(head);
        ll.ZigZag();
        ll.printLL(head);
    }
}
