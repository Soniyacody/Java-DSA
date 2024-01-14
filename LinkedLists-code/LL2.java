public class LL2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void add_first(int data) {
        // Step1 -create node
        Node newnode = new Node(data);
        size++;
        // Empty LL
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // step2-link head
        newnode.next = head;
        head = newnode;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("LL is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void add_middle(int data, int idx) {
        // Create a node
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        tail.next = newnode;
    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle() {
        // step1-detect cycle
        Node slow = head;
        Node fast = head;
        boolean loop_exist = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                loop_exist = true;
                break;
            }
        }
        if (loop_exist == false) {
            System.out.print("\nLoop does not exist\n");
            return;
        }
        System.out.print("\nLoop exist\n");
        // step2-slow=head and slow->+1 and fast->+1
        slow = head;
        // Node prev = null;
        Node prev = tail;
        while (fast == slow) {
            prev = fast;
            fast = fast.next;
            slow = slow.next;
        }
        // step3-set last.next=null
        prev.next = null;
    }

    public static void main(String args[]) {
        LL2 ll = new LL2();
        ll.add_first(6);
        ll.add_first(5);
        ll.add_first(3);
        ll.add_middle(4, 1);
        // System.out.print("\nLL is cycle or not : " + ll.isCycle());
        ll.removeCycle();
        ll.printLL();

    }
}
