package patterns;

public class Pattern26 {
//    111111
//    22222
//    3333
//    444
//    55
//    6
public static void main(String[] args) {
    pattern(6);
}

     static void pattern(int n) {
         for (int row = 0; row < n; row++) {
             for (int col = 0; col < n-row; col++) {
                 System.out.print(row+1);
             }
             System.out.println();
         }
    }
}
