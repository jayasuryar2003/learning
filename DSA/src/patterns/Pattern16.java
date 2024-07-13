package patterns;

public class Pattern16 {
    //        1
//           1 1
//          1 2 1
//         1 3 3 1
//        1 4 6 4 1

    public static void main(String[] args) {
        pattern(5); // You can change the value to print more rows
    }

    static void pattern(int n) {
        int[][] pascal = new int[n][n];

        // Initialize the Pascal Triangle array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }

        // Print the Pascal Triangle in the required format
        for (int row = 0; row < n; row++) {
            // Print leading spaces for formatting
            for (int colSpace = 0; colSpace < n - row - 1; colSpace++) {
                System.out.print(" ");
            }
            // Print the numbers in the row
            for (int col = 0; col <= row; col++) {
                System.out.print(pascal[row][col] + " ");
            }
            System.out.println();
        }
    }
}
