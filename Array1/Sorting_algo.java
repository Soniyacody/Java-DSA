public class Sorting_algo {
    public static void bubbleSort(int arr[]) {
        for (int round = 0; round < arr.length - 1; round++) {
            for (int turn = 0; turn < arr.length - round - 1; turn++) {
                if (arr[turn] > arr[turn + 1]) {
                    int temp = arr[turn];
                    arr[turn] = arr[turn + 1];
                    arr[turn + 1] = temp;
                }
            }
        }
        System.out.println("Printing sorted array :");
    }

    public static void selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_pos = i;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[min_pos] < arr[k]) {
                    min_pos = k;
                }
            }
            int temp = arr[min_pos];
            arr[min_pos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && (arr[prev] > curr)) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void main(String args[]) {
        System.out.println("Sorting algorithm ");
        int arr[] = { 14, 90, 7, 19, 5, 3, 2, 8 };
        // bubbleSort(arr);
        // selection_sort(arr);
        insertion_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
