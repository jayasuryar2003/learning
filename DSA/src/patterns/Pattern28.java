package patterns;

public class Pattern28 {
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *
public static void main(String[] args) {
    pattern(5);
}
static void pattern(int n){
    for (int row = 0; row < 2*n-1; row++) {
        int colSpace = row>n-1?row-n+1:n-row-1;
        int colStar = row>=n-1?2*n-row-1:row+1;
        for (int Space = 0; Space <colSpace ; Space++) {
            System.out.print(" ");
        }
        for (int star = 0; star < colStar; star++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
