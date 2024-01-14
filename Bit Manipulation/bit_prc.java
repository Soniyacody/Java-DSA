public class bit_prc {
    public static void swap(int n1, int n2) {
        n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;
        System.out.println("n2 ->" + n2);
        System.out.println("n1 ->" + n1);
    }

    public static void uppercase_to_lowercase() {
        // convert uppercase to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
            // prints abcdefghijklmnopqrstuvwxyz
        }
    }

    public static void main(String[] args) {
        // int n1 = 5, n2 = 3;
        // swap(n1, n2);
        uppercase_to_lowercase();
    }
}
