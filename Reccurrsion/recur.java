
public class recur {
    public static int fibonacci_Series(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        int fb_nm1 = fibonacci_Series(n - 1);
        int fb_nm2 = fibonacci_Series(n - 2);
        int fb = fb_nm1 + fb_nm2;
        return fb;
    }

    public static int FirstOccurrence(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }
        return FirstOccurrence(arr, key, i + 1);
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

    public static int LastOccurrence_self(int arr[], int key, int i) {
        if (i == 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return LastOccurrence_self(arr, key, i - 1);
    }

    public static int LastOccurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int Isfound = LastOccurrence(arr, key, i + 1);
        if (Isfound == -1 && arr[i] == key) {
            return i;
        }
        return Isfound;
    }

    public static int Power_fun(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return Power_fun(x, n - 1) * x;

    }

    public static int TillingProblem(int n) {// floor size=2*n
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // vertical choice
        int fnm1 = TillingProblem(n - 1);

        // horizontal choice
        int fnm2 = TillingProblem(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;
        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        // int n = 5;
        // System.out.println("Fibonacci series ->" + fibonacci_Series(5));
        // int arr[] = { 1, 2, 3, 4, 5, 5, 6, 7 };
        // System.out.println(IsSorted(arr, 0));
        // System.out.println(FirstOccurrence(arr, 5, 0));
        // System.out.println(LastOccurrence_self(arr, 2, arr.length - 1));
        // System.out.println(LastOccurrence(arr, 5, 0));
        // System.out.println(Power_fun(2, 10));
        // System.out.println(optimizedPower(2, 10));
        // System.out.println(TillingProblem(4));
    }
}
