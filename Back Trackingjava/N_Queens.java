public class N_Queens {
    public static void nQueens_allsol(char chessboard[][], int row) {
        // BaseCase
        if (row == chessboard.length) {
            PrintChessboard(chessboard);
            return;
        }
        // column loop
        for (int j = 0; j < chessboard.length; j++) {
            chessboard[row][j] = 'Q';
            nQueens_allsol(chessboard, row + 1);
            chessboard[row][j] = '_';
        }
    }

    public static void PrintChessboard(char chessboard[][]) {
        int n = chessboard.length;
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(" " + chessboard[i][j]);
            }
        }
    }

    public static void main(String args[]) {
        int n = 2;
        char chessboard[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessboard[i][j] = '_';
            }
        }
        PrintChessboard(chessboard);
    }
}
