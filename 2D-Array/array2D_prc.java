public class array2D_prc {
    public static void count(int matrix[][]) {
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    counter++;
                }
            }
        }
        System.out.print(" No. of 7's :" + counter);
    }

    public static void summ(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum += matrix[1][i];
        }
        System.out.println("Sum of elements in 2nd row :" + sum);
    }

    public static void transpose(int matrix[][]) {
        int m_transpose[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < m_transpose.length; i++) {
            for (int j = 0; j < m_transpose[0].length; j++) {
                m_transpose[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < m_transpose.length; i++) {
            for (int j = 0; j < m_transpose[0].length; j++) {
                System.out.print(m_transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        // count(matrix);
        // summ(matrix);
        transpose(matrix);
    }
}
