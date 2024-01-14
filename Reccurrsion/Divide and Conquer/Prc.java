public class Prc {
    public static void mergesort(int arr[], int si, int ei) {
        // Basecase
        if (si >= ei) {
            return;
        }
        // Kaam
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);// left part
        mergesort(arr, mid + 1, ei);// right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;// left part
        int j = mid + 1;// Right part
        int k = 0;// Temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];

        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Quicksort(int arr[], int si, int ei) {
        // Basecase
        if (si >= ei) {
            return;
        }
        // last element
        int pidx = partition(arr, si, ei);
        // Kaam
        // Call
        Quicksort(arr, si, pidx - 1);// left
        Quicksort(arr, pidx, ei);// right

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static int Search_rotated_sorted_array(int arr[], int target, int si, int ei) {
        // Base case
        if (si > ei) {
            System.out.println("s :" + si + "e : " + ei);
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            System.out.println("basecase" + mid);
            return mid;
        }
        // Mid on L1
        if (arr[si] <= target) {
            if (arr[si] <= target && target <= arr[mid]) {
                System.out.println("L1:left" + mid);
                return Search_rotated_sorted_array(arr, target, si, mid - 1);
            } else {
                System.out.println("L1:right" + mid);
                return Search_rotated_sorted_array(arr, target, mid + 1, ei);
            }
        }
        // mid on L2
        else {
            if (arr[mid] <= target && target <= arr[ei]) {
                System.out.println("L2:left" + mid);
                return Search_rotated_sorted_array(arr, target, mid + 1, ei);
            } else {
                System.out.println("L2:right" + mid);
                return Search_rotated_sorted_array(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 6, 3, 9, 5, 2, 8 };
        // mergesort(arr, 0, arr.length - 1);
        // Quicksort(arr, 0, arr.length - 1);
        int arr[] = { 4, 5, 6, 7, 8, 0, 1, 2 };
        int ans = Search_rotated_sorted_array(arr, 1, 0, arr.length - 1);
        System.out.println(ans);
        // PrintArr(arr);
    }
}