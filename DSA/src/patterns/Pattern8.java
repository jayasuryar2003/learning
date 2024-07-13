package patterns;

public class Pattern8 {
//        *
//       ***
//      *****
//     *******
//    *********
public static void main(String[] args) {
pattern(10);
}
public static void pattern(int n){
    for (int row = 0; row < n; row++) {
        for (int colSpace = 0; colSpace < n-row-1; colSpace++) {
            System.out.print(" ");
        }
        for (int col = 0; col < 2*row+1; col++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
}


