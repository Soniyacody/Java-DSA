public class linkedlist1 {
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

    public void addFirst(int data) {
        // step-1 : create new node
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // step2: newnode next=head
        newnode.next = head;// linked
        // step3: head=newnode
        head = newnode;
    }

    public void addLast(int data) {
        // step1:create new node
        Node newnode = new Node(data);
        size++;
        // check for head=null (Empty linked list)
        if (head == null) {
            head = tail = newnode;
        }
        // step2: assign tail's next as new node
        tail.next = newnode;
        // step3:assign newnode ad tail
        tail = newnode;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty ");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        System.out.println("\nYou deleted node: " + head.data);
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            return;
        }
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        System.out.println("You removed last element ");

    }

    public void search(int target) {
        int i = 0;
        Node temp = head;
        while (i < size) {
            if (temp.data == target) {
                System.out.println("\nFound target : " + i);
                return;
            }
            temp = temp.next;
            i++;
        }
        System.out.println("\nTarget not found");
    }

    public void printLL() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        System.out.print("\n");
        while (temp != null) {
            System.out.print(temp.data + " > ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int myway_recursive_search(int target, int idx, Node temp) {
        // Base case
        if (idx == size) {
            return -1;
        }
        // Found
        if (temp.data == target) {
            return idx;
        }
        temp = temp.next;
        idx++;
        return myway_recursive_search(target, idx, temp);
    }

    public int helper(Node head, int key) {
        // Base case
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recursive_search(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null, curr = tail = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void delete_nth_from_end(int n) {
        // calculate size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (n == size) {
            head = head.next;
            return;
        }
        // sz-n
        int i = 1;
        int idx_tofind = size - n;
        Node prev = head;
        while (i < idx_tofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // Slow Fast approach
    public Node find_mid(Node head) {// Helper function
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;
    }

    public boolean check_palindrome() {
        if (head == null) {
            return true;
        }
        if (head.next == null) {
            return true;
        }
        // Step1-find mid
        Node mid_node = find_mid(head);
        // step2-reverse half LL
        Node prev = null, curr = mid_node, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;// Left half head
        // step3-check half and half right
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[]) {
        // linkedlist1 ll = new linkedlist1();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addMiddle(2, 3);
        // ll.removeFirst();
        // ll.removeLast();
        // ll.printLL();
        // ll.search(4);
        // Node temp = head;
        // int result = ll.myway_recursive_search(4, 0, temp);
        // System.out.print("\nElement is situated at " + result);
        // System.out.println("\nSize of LL : " + size);
        // int result = ll.recursive_search(9);
        // System.out.println("\nElement is situated at : " + result);
        // ll.reverse();
        // ll.delete_nth_from_end(2);
        // ll.printLL();

        linkedlist1 ll2 = new linkedlist1();
        ll2.addFirst(1);
        ll2.addLast(2);
        // ll2.addLast(2);
        // ll2.addLast(1);
        ll2.printLL();
        System.out.println("\nCheck Palindrome : " + ll2.check_palindrome());
    }
}
