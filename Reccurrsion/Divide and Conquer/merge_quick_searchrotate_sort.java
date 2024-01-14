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
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {// loop for leftpart
            temp[k++] = arr[i++];
        }
        while (j <= ei) { // right part
            temp[k++] = arr[j++];
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

    public static int search_sorted_rotate(int arr[], int target, int si, int ei) {
        // Basecase
        if (si > ei) {
            return -1;
        }
        // kaam->search in sorted rotated array
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) { // case1->target =mid
            return mid;
        }
        // Case2->mid lies on line1
        if (arr[si] <= arr[mid]) {
            // case(2-A)->lie left of mid on line1
            if (arr[si] <= target && target <= arr[mid]) {
                return search_sorted_rotate(arr, target, si, mid - 1);
            } else {
                // case(2-B)-> target lies on right on line1
                return search_sorted_rotate(arr, target, mid + 1, ei);
            }
        }
        // case3->mid lies on line2
        else {
            // case(3A)->target lies right part of line2
            if (arr[mid] <= target && target <= arr[ei]) {
                return search_sorted_rotate(arr, target, mid + 1, ei);
            } else {
                // case(3B)->target lies on left part of line 2
                return search_sorted_rotate(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 15, 80 };
        MergeSort(arr, 0, arr.length - 1);
        // quick_sort(arr, 0, arr.length - 1);
        print(arr);
        // int arr[]={4,5,6,7,9,10,11,0,1,2};
        // System.out.print(search_sorted_rotate(arr,1,0,arr.length-1));

    }
}
