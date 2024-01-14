public class arr_lec2 {
    public static int binary_search(int arr[], int item) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (item == arr[mid]) {
                System.out.println("I found element ->" + arr[mid]);
                return 1;
            } else if (arr[mid] > item) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.print("Element not found");
        return -1;
    }

    public static void reversed(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        // System.out.print(arr.length - 1);
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        System.out.println();
        System.out.print(" Reversed array ->> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 12, 14, 15, 34, 56 };
        // binary_search(arr, 4);
        System.out.print(" array ->> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        reversed(arr);
    }
}
