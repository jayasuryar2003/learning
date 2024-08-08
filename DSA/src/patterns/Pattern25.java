package patterns;

public class Pattern25 {
//        *****
//       *   *
//      *   *
//     *   *
//    *****
    public static void main(String[] args) {
pattern(5);
    }
    static void pattern(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print(" ");
            }
            for (int colStar = 0; colStar < n; colStar++) {
                if(colStar==0||colStar==n-1||row==0||row==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
