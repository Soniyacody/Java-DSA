public class rec_adv1 {
    public static void tower_of_tanwoi(int n, char src, char help, char dest) {
        if (n == 1) {
            System.out.println("Move disk" + n + " from " + src + " to " + dest);
            return;
        }
        tower_of_tanwoi(n - 1, src, dest, help);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        tower_of_tanwoi(n - 1, help, src, dest);
    }

    public static void main(String[] args) {
        tower_of_tanwoi(3, 'A', 'B', 'C');
    }
}
