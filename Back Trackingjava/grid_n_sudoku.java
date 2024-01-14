public class grid_n_sudoku {
    public static int Gridways(int i, int j, int n, int m) {
        // Basecase
        if (i == n - 1 && j == m - 1) {// Condition for last cell
            return 1;
        } else if (i == n || j == m) {// Condition for boundary cross
            return 0;
        }
        // Right
        int w1 = Gridways(i, j + 1, n, m);
        int w2 = Gridways(i + 1, j, n, m);
        return w1 + w2;
    }

    // public static boolean isSafe(int val, int board[][], int row, int col) {

    // }

    // public static boolean sudoku(int row, int col, int board[][]) {
    // // Base case
    // if (row == board.length) {
    // return;
    // }
    // int nextRow = row, nextcol = col + 1;
    // if (col + 1 == 9) {
    // nextRow = row + 1;
    // nextcol = 0;
    // }
    // if (board[row][col] != 0) {
    // return sudoku(nextRow, nextcol, board);
    // }
    // for (int digit = 1; digit <= 9; digit++) {
    // if (isSafe(digit, board, row, col)) {
    // board[digit][col] = digit;
    // if(sudoku(nextRow, nextcol, board)){
    // return true;
    // }
    // board[row][col]=0;
    // }
    // }
    // }
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        for (int i = 0; i <= 8; i++) {
            // colummn condition
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        for (int j = 0; j <= 8; j++) {
            // row condition
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // Grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudkoSolver(int sudoku[][], int row, int col) {
        // Base case
        if (row == 9) {
            return true;
        } else if (row == 9) {
            return false;
        }
        // recurssion
        int nextRow = row, nextcol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextcol = 0;
        }
        if (sudoku[row][col] != 0) {
            return sudkoSolver(sudoku, nextRow, nextcol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudkoSolver(sudoku, nextRow, nextcol)) {
                    // Solution exist
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + "  ");
            }
            System.out.println();

        }
    }

    public static void main(String args[]) {
        // int n = 3, m = 3;
        // System.out.println("Total ways : "+Gridways(0, 0, n, m));
        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 0, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        if (sudkoSolver(sudoku, 0, 0)) {
            System.out.println("Solution exist");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution does not exist");
        }
    }
}
