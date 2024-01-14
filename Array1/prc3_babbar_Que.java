class Book_allocation {
    boolean IsPossibleSolution(int book[], int m, int mid) {
        int student_count = 1;
        int pagesum = 0;
        int n = book.length;
        for (int i = 0; i < n; i++) {
            if (pagesum + book[i] <= mid) {
                pagesum += book[i];
            } else {
                student_count++;
                if (student_count > m || book[i] > mid) {
                    return false;
                }
                pagesum = book[i];
            }
        }
        return true;
    }

    int allocate_Books(int book[], int m) {
        int s = 0, sum = 0;
        int n = book.length;
        for (int i = 0; i < n; i++) {
            sum += book[i];
        }
        int e = sum, ans = -1;
        int mid = s + (e - s) / 2;
        while (s <= e) {
            if (IsPossibleSolution(book, m, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }
}

public class prc3_babbar_Que {
    public static void main(String args[]) {
        /*
         * int book[] = { 10, 20, 30, 40 };
         * Book_allocation ob = new Book_allocation();
         * int ans = ob.allocate_Books(book, 2);
         * System.out.print("Book allocation ->" + ans);
         */
    }
}
