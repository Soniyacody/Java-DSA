public class advpattern {
    public static void hollow_rec(int tRow, int tCol) {
        // outer loop
        for (int i = 1; i <= tRow; i++) {
            for (int j = 1; j <= tCol; j++) {
                if (i == 1 || i == tRow || j == 1 || j == tCol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inv_rot_Triangle(int row, int col) {
        for (int i = 1; i <= row; i++) {// row
            for (int j = 1; j <= row - i; j++) {// spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {// stars
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void flyod_triangle(int num) {
        int iterate = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(iterate + " ");
                iterate++;
            }
            System.out.println();
        }
    }

    public static void inv_pyramid(int row) {
        for (int i = 0; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void triangle_0_1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

    }

    public static void butterfly(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int k = 1; k <= 2 * (num - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int k = 1; k <= 2 * (num - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void Solid_rhombus(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                if (i == 1 || j == 1 || i == num || j == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num; i >= 0; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // hollow_rec(4, 5);
        // inv_rot_Triangle(5, 6);
        // inv_pyramid(7);
        // flyod_triangle(4);
        // triangle_0_1(7);
        // butterfly(4);
        // Solid_rhombus(7);
        // hollow_rhombus(6);
        diamond(3);
    }
}
