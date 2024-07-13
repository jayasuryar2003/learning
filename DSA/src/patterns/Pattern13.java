package patterns;

public class Pattern13 {
//         *
//        * *
//       *   *
//      *     *
//     *********
public static void main(String[] args) {
    pattern(5);
}
static void pattern(int n){
    for (int row = 0; row < n; row++) {
        for (int col = 0; col < n-row-1; col++) {
            System.out.print(" ");
        }
        for (int col = 0; col < 2*row+1; col++) {
            if (col==0||row==n-1||col==2*row){
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
