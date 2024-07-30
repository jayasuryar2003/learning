package patterns;

public class Pattern20 {
//    ****
//    *  *
//    *  *
//    ****
public static void main(String[] args) {
    pattern(5);
}
static void pattern(int n){
    for (int row = 0; row < n; row++) {
        for (int col = 0; col < n-1; col++) {
            if(row==0||row==n-1||col==0||col==n-2){
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
