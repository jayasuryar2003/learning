package patterns;

public class Pattern4 {
//    1
//    12
//    123
//    1234
//    12345
public static void main(String[] args) {
pattrn(5);
}
static void pattrn(int n){
    for (int row = 0; row < n; row++) {
        for (int col = 0; col < row+1; col++) {
            System.out.print(col+1);
        }
        System.out.println();
    }
}
}
