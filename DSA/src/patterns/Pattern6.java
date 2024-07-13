package patterns;

public class Pattern6 {
//        *
//       **
//      ***
//     ****
//    *****
public static void main(String[] args) {
pattern(5);
}
static void pattern(int n){
    for (int row = 0; row < n; row++) {
        for (int colSpace = 0; colSpace < n-row-1; colSpace++) {
            System.out.print( " ");
        }
        for (int i = 0; i < row+1; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
