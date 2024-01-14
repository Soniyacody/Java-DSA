class First_and_last_occurrence {
    int first_occurence(int arr[], int key) {
        int s = 0, e = arr.length - 1, ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key) {
                ans = mid;
                e = mid - 1;
            } else if (arr[mid] < key) {
                s = mid + 1;
            } else if (arr[mid] > key) {
                e = mid - 1;
            }
        }
        return ans;
    }

    int last_occurence(int arr[], int key) {
        int s = 0, e = arr.length - 1, ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key) {
                ans = mid;
                s = mid + 1;
            } else if (arr[mid] < key) {
                s = mid + 1;
            } else if (arr[mid] > key) {
                e = mid - 1;
            }
        }
        return ans;
    }
}

public class prac_babbar_Que {
    public static int peak_element(int arr[]) {
        int s = 0, e = arr.length - 1;
        int mid = s + (e - s) / 2;
        while (s < e) {
            if (arr[mid] < arr[mid + 1]) {
                // element on line1
                s = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                // element could be on peak or on line 2
                e = mid;
            }
            mid = s + (e - s) / 2;
        }
        return mid;
    }

    public static void main(String args[]) {
        // int arr[] = { 1, 2, 3, 3, 3, 5 };
        // int key = 3;
        // First_and_last_occurrence obj = new First_and_last_occurrence();
        // int first = obj.first_occurence(arr, key);
        // System.out.println("first occurrence ->" + first);
        // int last = obj.last_occurence(arr, key);
        // System.out.println("Last occurrence ->" + last);
        // int total = last - first;
        // System.out.print("Total number of occurrence of " + key + " ->" + total);
        int arr1[] = { 1, 2, 3, 4, 5, 7, 3, 1 };
        System.out.print(peak_element(arr1));
    }
}
