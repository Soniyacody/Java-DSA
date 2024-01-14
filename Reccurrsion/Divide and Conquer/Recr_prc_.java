class Q1 {
    public void merge_sort_string(String arr[], int si, int ei) {
        // Base case

        if (si >= ei) {
            return;
        }
        // kaam -> 1) divide 2) merge
        // 1)dividing array
        int mid = si + (ei - si) / 2;
        merge_sort_string(arr, si, mid);
        merge_sort_string(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si; // for left part
        int j = mid + 1; // for right part
        int k = 0;// for temp array
        while (i <= mid && j <= ei) {
            int check = arr[i].compareTo(arr[j]);
            if (check < 0) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
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
}

/*
 * class Q2 {
 * public int most_repeated_element(int nums[], int si, int ei, int max) {
 * // Basecase
 * if (si >= ei) {
 * return max;
 * }
 * System.out.print("runnnnn1 ");
 * int returned[] = Pivot(nums, si, ei);
 * int Pidx = returned[0];
 * System.out.print("runnnnn2 ");
 * most_repeated_element(nums, si, Pidx - 1, returned[1]);
 * most_repeated_element(nums, Pidx, ei, returned[1]);
 * return returned[1];
 * }
 * 
 * public int[] Pivot(int nums[], int si, int e) {
 * int i = si - 1, pivot = nums[e], max = 0;// doubt
 * for (int j = si; j < e; j++) {
 * System.out.print("runnnnn3 ");
 * if (nums[j] <= pivot) {
 * if (nums[j] == pivot) {
 * max++;
 * }
 * i++;
 * int temp = nums[j];
 * nums[j] = nums[i];
 * nums[i] = temp;
 * System.out.print("runnnnn4  ");
 * }
 * }
 * i++;
 * int temp = pivot;
 * nums[e] = nums[i];
 * nums[i] = temp;
 * pivot = nums[e];
 * return new int[] { pivot, max };
 * }
 * }
 */
class Q2 {
    public void sort(int nums[], int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;
        sort(nums, s, mid);// left part
        sort(nums, mid + 1, e);// right part
        merge(nums, mid, s, e);
    }

    public void merge(int nums[], int mid, int s, int e) {
        int temp[] = new int[e - s + 1];
        int i = s; // left part pointer
        int j = mid + 1;// right part pointer
        int k = 0; // temp array
        while (i <= mid && j <= e) {
            if (nums[i] < nums[j]) {
                temp[k] = nums[i];
                i++;
                k++;
            } else {
                temp[k] = nums[j];
                j++;
                k++;
            }
        }
        while (i <= mid) { // remaining part of left array
            temp[k++] = nums[i++];
        }
        while (j <= e) {// remaining part of right array
            temp[k++] = nums[j++];
        }
        for (i = s, k = 0; k < temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }

    public void most_repeated_element(int nums[]) {
        sort(nums, 0, nums.length - 1);
        // int i = 0, e = nums.length - 1;
        // int max = Integer.MIN_VALUE, count = 0;
        // while (i < nums.length) {
        // int mid = i + (e - i) / 2;
        // }
    }
}

public class Recr_prc_ {
    public static void main(String[] args) {
        /*
         * String arr[] = { "sun", "earth", "mars", "mercury", "jupiter", "uranus",
         * "neptune", "pluto" };
         * Q1 ob = new Q1();
         * ob.merge_sort_string(arr, 0, arr.length - 1);
         * for (int i = 0; i < arr.length; i++) {
         * System.out.print(arr[i] + " ");
         * }
         */
        Q2 ob = new Q2();
        int nums[] = { 1, 1, 1, 2, 2, 22, 2, 2, 4, 6 };
        ob.most_repeated_element(nums);
        // System.out.print(ob.most_repeated_element(nums, 0, nums.length - 1, 0));

    }
}
