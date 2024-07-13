package patterns;

public class Pattern7 {
//    *****
//     ****
//      ***
//       **
//        *
public static void main(String[] args) {
    pattern(5);
}
static void pattern(int n){
    for (int row = 0; row < n; row++) {
        for (int i = 0; i < row; i++) {
            System.out.print(" ");
        }
        for (int col = 0; col < n-row; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
