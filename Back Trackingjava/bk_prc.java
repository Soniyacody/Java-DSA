
public class bk_prc {
    public static void ChgArray(int arr[], int i, int val) {
        // Base caase
        if (i == arr.length) {
            PrtArray(arr);
            return;
        }
        arr[i] = val;
        ChgArray(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void PrtArray(int arr[]) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        System.out.println("Backtrack");
        int arr[] = new int[5];
        ChgArray(arr, 0, 1);
        PrtArray(arr);
    }
}