// import java.util.*;

public class leetcode {
    public static int max_Diff_Product(int nums[]) {
        if (nums.length == 0 || nums.length == 1) {
            return 0;
        }
        // * */ Method 1
        // Arrays.sort(nums);
        // return ((nums[nums.length - 1] * nums[nums.length - 2]) - nums[0] * nums[1]);
        int max1 = Integer.MIN_VALUE, max0 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            // Max value
            if (max1 < nums[i]) {
                max0 = max1;
                max1 = nums[i];
            } else if (max0 < nums[i]) {
                max0 = nums[i];
            }
            // Min value
            if (min1 > nums[i]) {
                min2 = min1;
                min1 = nums[i];
            } else if (min2 > nums[i]) {
                min2 = nums[i];
            }
        }
        System.out.println(max1 + " : " + max0 + " : " + min1 + " : " + min2);
        return ((max1 * max0) - (min1 * min2));
    }

    public static void main(String args[]) {
        int num[] = { 5, 6, 2, 7, 4 };
        System.out.println(max_Diff_Product(num));
        System.out.println(9 * 8 - 2 * 4);
    }
}
