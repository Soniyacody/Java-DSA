public class arr_lec3 {
    public static void printPairs(int arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("( " + arr[i] + "," + arr[j] + " )");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs of array :" + total);
    }

    public static void SubArray(int arr[]) {
        int all = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print("( " + arr[i] + "," + arr[k] + " )");
                }
                System.out.println();
                all++;
            }
            System.out.println();
        }
        System.out.println("Total Subarray :" + all);
    }

    public static void SubArray_Max_Min(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum < min) {
                    min = sum;
                }
                if (sum > max) {
                    max = sum;
                }
                System.out.println();
                sum = 0;
            }
            System.out.println();
        }
        System.out.println("Minimum sum of Subarray :" + min);
        System.out.println("Maximum sum of Subarray :" + max);
    }

    public static int rough(int arr[], int start, int end) {
        int prefixArray[] = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prefixArray[i] = sum;
        }
        System.out.println("Sum of Array ->" + (prefixArray[end] - prefixArray[start - 1]));
        return -1;
    }

    public static void kadanes_algo(int arr[]) {
        int cur_sum = 0, max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cur_sum += arr[i];
            max_sum = Math.max(cur_sum, max_sum);
            if (cur_sum < 0) {
                cur_sum = 0;
            }
        }
        System.out.println("Maximum subarray :" + max_sum);
    }

    public static void trap_rain_water() {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        // calculate left max biundary-array
        int left_max[] = new int[height.length];
        left_max[0] = height[0];
        for (int i = 1; i < left_max.length; i++) {
            left_max[i] = Math.max(height[i], left_max[i - 1]);
        }
        // calculate right max boundary-array
        int right_max[] = new int[height.length];
        int n = height.length;
        right_max[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(height[i], right_max[i + 1]);
        }
        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterlevel=min(left max,right max)-height
            int waterlevel = Math.min(left_max[i], right_max[i]);
            trappedWater += waterlevel - height[i];
        }
        System.out.println("Trapped water : " + trappedWater);
    }

    public static void main(String args[]) {
        // int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // printPairs(arr);
        // SubArray(arr);
        // SubArray_Max_Min(arr);
        // rough(arr, 3, 5);
        // kadanes_algo(arr);
        trap_rain_water();
    }
}
