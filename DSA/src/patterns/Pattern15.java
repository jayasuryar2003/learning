package patterns;

public class Pattern15 {
//            *
//           * *
//          *   *
//         *     *
//        *       *
//         *     *
//          *   *
//           * *
//            *
public static void main(String[] args) {
pattern(5);
}
static void pattern(int n){
    for (int row = 0; row<2*n-1; row++) {
        int TotalColSpace=row>=n?row-n+1:n-row-1;
        for (int colSpace = 0; colSpace <TotalColSpace ; colSpace++) {
            System.out.print(" ");
        }
        int TotalColStar=row<n?2*row+1:2 * (2 * n - row - 2) + 1;
        for (int col = 0; col <TotalColStar ; col++) {
            if (col==0||col==TotalColStar-1){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();

    }
}
}
