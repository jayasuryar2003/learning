package patterns;

public class pattern9 {
//    *********
//     *******
//      *****
//       ***
//        *
public static void main(String[] args) {
 pattern(5);
}
static void pattern(int n){
    for (int row = 0; row < n; row++) {
        for (int colSpace = 0; colSpace < row; colSpace++) {
            System.out.print(" ");
        }
        for (int col = 0; col < 2*n-2*row-1; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
