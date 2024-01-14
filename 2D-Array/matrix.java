import java.util.Scanner;

public class matrix {
    public static void Min_max(int matrix[][]) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
    }

    public static void spiral_matrix(int matrix2[][]) {
        int start_row = 0, start_col = 0, end_row = matrix2.length - 1, end_col = matrix2[0].length - 1;
        while (start_col <= end_col && start_row <= end_col) {
            // top
            for (int j = start_col; j <= end_col; j++) {
                System.out.print(matrix2[start_row][j] + "  ");
            }
            // right
            for (int i = start_row + 1; i <= end_row; i++) {
                System.out.print(matrix2[i][end_col] + "  ");
            }
            // bottom
            for (int j = end_col - 1; j >= start_col; j--) {
                System.out.print(matrix2[end_row][j] + "  ");
            }
            // left
            for (int i = end_row - 1; i >= start_row + 1; i--) {
                System.out.print(matrix2[i][start_col] + "  ");
            }
            start_col++;
            start_row++;
            end_col--;
            end_row--;
        }
    }

    public static boolean sort_algo_leftbottom(int matrix2[][], int key) {
        int row = matrix2.length - 1, col = 0;
        while (row >= 0 && col <= matrix2.length - 1) {
            if (key == matrix2[row][col]) {
                System.out.print("Found key at (" + row + "," + col + ") :" + key);
                return true;
            } else if (key > matrix2[row][col]) {
                col++;
            } else {
                row--;
            }
        }
        System.out.println("Key not found ! ");
        return false;
    }

    public static boolean sort_algo_righttop(int matrix2[][], int key) {
        int row = 0, col = matrix2.length - 1;
        while (col >= 0 && row <= matrix2.length - 1) {
            if (key == matrix2[row][col]) {
                System.out.print("Found key at (" + row + "," + col + ") :" + key);
                return true;
            } else if (key > matrix2[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        System.out.println("Key not found ! ");
        return false;
    }

    public static void diagonal_sum_n(int matrix2[][]) {
        int sum = 0;
        for (int i = 0; i < matrix2.length; i++) {
            // pd
            sum += matrix2[i][i];
            // sd
            if (i != matrix2.length - 1 - i) {
                sum += matrix2[i][matrix2.length - 1 - i];
            }
        }
        System.out.println("Sum of diagonal matrix ->" + sum);
    }

    public static void diagonal_sum_n2(int matrix2[][]) {
        int sum = 0;
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                if (i == j) {
                    sum += matrix2[i][j];
                }
                if (i + j == matrix2.length - 1) {
                    sum += matrix2[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal matrix ->" + sum);
    }

    public static void main(String[] args) {
        // int matrix[][] = new int[3][3];
        // int m=matrix.length,n=matrix[0].length;
        // base(matrix);
        // Min_max(matrix);
        int matrix2[][] = { { 10, 20, 30, 40 },
                { 50, 60, 70, 80 },
                { 90, 100, 110, 120 },
                { 130, 140, 150, 160 } };
        // spiral_matrix(matrix2);
        // diagonal_sum_n2(matrix2);
        // diagonal_sum_n(matrix2);
        // sort_algo_leftbottom(matrix2, 120);
        sort_algo_righttop(matrix2, 100);
    }

    public static void base(int matrix[][]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {// row
            for (int j = 0; j < 3; j++) {// column
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {// row
            for (int j = 0; j < 3; j++) {// column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
