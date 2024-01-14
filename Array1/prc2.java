public class prc2 {
    public static boolean Twice(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans &= arr[i];
        }
        if (ans == 0) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 10 };
        System.out.println("Answer : " + Twice(arr));
    }
}
