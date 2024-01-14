//package recurrrsionBasics;

public class recur_1 {
    public static int fibonacci_Series(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        int fb_nm1 = fibonacci_Series(n - 1);
        int fb_nm2 = fibonacci_Series(n - 2);
        int fb = fb_nm1 + fb_nm2;
        return fb;
    }

    public static boolean IsSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return IsSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        // int n = 5;
        // System.out.println("Fibonacci series ->" + fibonacci_Series(5));
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        // System.out.println(IsSorted(arr, 0));
    }
}
