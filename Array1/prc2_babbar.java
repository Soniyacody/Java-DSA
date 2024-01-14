
public class prc2_babbar {
    public static int pivot_element() {
        int arr[] = { 6, 7, 8, 9, 12, 1, 2, 3, 4 };
        int s = 0, e = arr.length - 1, mid = s + (e - s) / 2;
        while (s < e) {
            if (arr[0] <= arr[mid]) {
                s = mid + 1;
            } else {
                e = mid;
            }
            mid = s + (e - s) / 2;
        }
        return mid;
    }

    public static int binary_search(int arr[], int item, int s, int e) {
        int start = s;
        int end = e;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (item == arr[mid]) {
                return mid;
            } else if (arr[mid] > item) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.print("Element not found");
        return -1;
    }

    public static int pivot_rotated_array(int key) {
        int nums[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int pivot = pivot_element(), ans;
        if (key >= nums[pivot] && key <= nums[nums.length - 1]) {
            ans = binary_search(nums, key, pivot, nums.length - 1);
        } else {
            ans = binary_search(nums, key, 0, pivot - 1);
        }
        return ans;
    }

    public static void main(String args[]) {
        // System.out.print(pivot_element());
        System.out.println(pivot_rotated_array(4));
    }

}
