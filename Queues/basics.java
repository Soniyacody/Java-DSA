public class basics {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front_ele = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }

        public boolean isFull() {
            return (rear + 1) % size == front_ele;
        }

        public void add_circular_queue(int data) {
            if (isFull()) {
                System.out.println("Queue is fulled");
                return;
            }
            // Adding first element
            if (front_ele == -1) {
                front_ele = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove_circular_queue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[front_ele];

            if (front_ele == rear) {
                front_ele = rear = -1;
            } else {
                front_ele = (front_ele + 1) % size;
            }
            return val;
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add_circular_queue(1);
        q.add_circular_queue(2);
        q.add_circular_queue(3);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove_circular_queue();
        }
    }
}