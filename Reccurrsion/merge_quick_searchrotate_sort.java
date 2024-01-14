public class merge_quick_searchrotate_sort {
    public static void MergeSort(int arr[], int si, int ei) {
        // Basecase
        if (si >= ei) {
            return;
        } // kaaam
        int mid = si + (ei - si) / 2;
        MergeSort(arr, si, mid); // left part
        MergeSort(arr, mid + 1, ei); // right part
        Merge(arr, si, mid, ei); // merge work
    }

    public static void Merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // i for iterate left part
        int j = mid + 1; // j for iterate right part
        int k = 0; // k for iterate temp array
        while (i <= mid && j <= ei) {
            System.out.println();
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                System.out.print(temp[k] + "i ");
                i++;
            } else {
                temp[k] = arr[j];
                System.out.print(temp[k] + " j");
                j++;
            }
            k++;
        }
        while (i <= mid) {// loop for leftpart
            arr[k++] = arr[i++];
        }
        while (j <= ei) { // right part
            arr[k++] = arr[j++];
        }
        // copy temp array into original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void quick_sort(int arr[], int si, int ei) {
        // Basecase
        if (si >= ei) {
            return;
        }
        int Pidx = pivot(arr, si, ei); // find pivot function
        quick_sort(arr, si, Pidx - 1); // left part
        quick_sort(arr, Pidx + 1, ei); // right part
    }

    public static int pivot(int arr[], int si, int ei) {
        // pivot element ->last element
        int pivot = arr[ei];
        int i = si - 1; // to make place for elements smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];// pivot=arr[i]
        arr[i] = temp;
        return i;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 15, 80 };
        // MergeSort(arr, 0, arr.length - 1);
        quick_sort(arr, 0, arr.length - 1);
        print(arr);
    }
}
