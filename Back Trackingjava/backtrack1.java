public class backtrack1 {
    // Q1
    public static void changeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // kaam
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); // fnx call step
        arr[i] = arr[i] - 2;// backtracking step
    }

    public static void printArr(int arr[]) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Q2->to find subsets of string
    public static void FindSubset(String str, String ans, int i) {
        // Base case
        if (str.length() == i) {
            if (ans == "") {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // Yes->Recursion
        FindSubset(str, ans + str.charAt(i), i + 1);
        // No-backtracking
        FindSubset(str, ans, i + 1);
    }

    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);
        FindSubset("abc", "", 0);
    }
}