package patterns;

public class Pattern12 {
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
public static void main(String[] args) {
pattern(5);
}
static void pattern(int n){
    for (int row = 0; row < 2*n-1; row++) {
        int TotalSpaceInRow = n>row?row:2*n-row-2;
        for (int i = 0; i < TotalSpaceInRow; i++) {
            System.out.print(" ");
        }
        int TotalStarInRow=n>row?n-row:row-n+2;
        for (int i = 0; i < TotalStarInRow; i++) {
            System.out.print(" *");
        }
        System.out.println();
    }
}
}
