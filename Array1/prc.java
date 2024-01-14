class prc {
    public static boolean Q1(int nums[]) {
        boolean temp[] = new boolean[nums.length];
        for (int j = 0; j < temp.length; j++) {
            temp[j] = false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp[nums[i]] == true) {
                return false;
            }
            temp[nums[i]] = true;
        }
        return true;
    }

    public static int Q2(int nums[], int target) {
        int pivot = -1; // start = 0, end = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                pivot = i;
                break;
            }
            if (nums[i] > target) {
                return -1;
            }
        } /*
           * while (start < end && nums[start] < nums[pivot] && nums[pivot] < nums[end]) {
           * int temp = nums[start];
           * nums[start] = nums[end];
           * nums[end] = temp;
           * start++;
           * end--;
           * }
           */
        int curr = 0, i, n = nums.length;
        while (curr < pivot) {
            int temp = nums[0];
            for (i = 1; i < nums.length; i++) {
                nums[i - 1] = nums[i];
            }
            nums[n - 1] = temp;
            curr++;
        }
        return target;
    }

    public static int Q3(int nums[]) {
        int buy = nums[0], profit, max_profit = 0;
        for (int i = 0; i < nums.length; i++) {
            buy = Math.min(nums[i], buy);
            if (nums[i] > buy) {
                profit = nums[i] - buy;
                max_profit = Math.max(max_profit, profit);
            }
        }
        return max_profit;
    }

    public static void triplet(int nums[]) {
        int n = nums.length, j = n / 2;
        int i, k;
        for (i = 0, k = n - 1; i <= j; i++, k--) {
            if (nums[i] + nums[j] + nums[k] == 0) {
                break;
            }
        }
        System.out.print(nums[i] + " " + nums[j] + " " + nums[k]);
    }

    public static void reverse(int nums[]) {
        for (int i = 0, j = nums.length - 1; i <= j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 9, 10, 11, 12, 13, 14 };
        // System.out.println(Q1(nums));
        // System.out.println(Q2(nums, 7) + "\n");
        // triplet(nums);
        reverse(nums);
    }
}