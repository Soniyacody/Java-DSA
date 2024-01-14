import java.util.*;

public class lovebabbar {
    public static void swap_alternate(int nums[]) {
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void unique_element(int nums[]) {
        // array-2m+1->>means each element repeats twice but one element is not find
        // that element
        // To find unique element do "xor"operation on array
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
            System.out.print(ans + "  ");
        }
        System.out.print("Unique element in an array :" + ans);
    }

    public static int duplicate() {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 2 };
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        for (int i = 1; i < nums.length; i++) {
            ans = ans ^ i;
        }
        return ans;
    }

    public static void intersection_array() {
        int arr1[] = { 1, 2, 2, 3, 4, 4, 5, 9 };
        int arr2[] = { 0, 2, 3, 4, 7, 8, 10 };
        int l = Math.min(arr1.length, arr2.length), ans[] = new int[l];
        int i = 0, j = 0, k = 0;
        while (arr1.length > i && arr2.length > j) {
            if (arr1[i] == arr2[j]) {
                ans[k] = arr1[i];
                // System.out.print(ans[k] + " ");
                arr2[j] = -12345;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                j++;
            } else {
                i++;
                j++;
            }
            i++;
        }
        for (k = 0; k < ans.length; k++) {
            System.out.print(ans[k] + " ");
        }
    }

    public static void pairsum() {
        int nums[] = { 1, 2, 3, 3, 4, 5, 6, 8 }, S = 5;
        Vector<Vector<Integer>> ans = new Vector<Vector<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Vector<Integer> temp = new Vector<>();
                if (nums[i] + nums[j] == S) {
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    ans.add(temp);
                }
            }
        }
        System.out.print(ans);
    }

    public static boolean uniqueOccurrences() {
        int arr[] = { 1, 2, 3, 3, 4 };
        Arrays.sort(arr);
        int count = 0, k = 0;
        int ans[] = new int[arr.length];
        int answer = 0;
        for (int i = 0; i < arr.length; i = i + count) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            ans[k] = count;
            k++;
        }
        System.out.println("K->" + k + "     ");
        for (int m = 0; m <= k; m++) {
            System.out.print(ans[m] + " ");
            answer = answer ^ ans[m];
        }
        System.out.println(answer + "qans");
        if (answer != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        // swap_alternate(nums);
        // unique_element(nums);
        // System.out.print(duplicate());
        // intersection_array();
        pairsum();
    }
}
