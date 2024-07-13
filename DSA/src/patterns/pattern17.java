package patterns;

import java.util.Arrays;

public class pattern17 {

//           1
//          212
//         32123
//        4321234
//         32123
//          212
//           1
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n) {
        int totalRow = 2*n-1;
        for (int row = 0; row < totalRow; row++) {
            int colSpace = row>=n?row-n+1:n-row-1;
            int MaxNumber = row>=n?totalRow-row:row+1;
            for (int col = 0; col < colSpace; col++) {
                System.out.print(" ");
            }
            for (int colNumber = MaxNumber; colNumber > 0; colNumber--) {
                System.out.print(colNumber);
            }
            for (int ascending = 2; ascending <= MaxNumber ; ascending++) {
                System.out.print(ascending);
            }
            System.out.println();
        }
    }
}
