package patterns;

public class Pattern5 {
//    *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
public static void main(String[] args) {
pattern(5);
}
//static void pattern(int n){
//    for (int row = 0; row < 2*n-1; row++) {
//        if(row>=n){
//            for (int col = 0; col <2*n-1-row ; col++) {
//                System.out.print("* ");
//            }
//        }
//        else {
//            for (int col = 0; col < row+1; col++) {
//                System.out.print("* ");
//            }
//        }
//        System.out.println();
//    }
//}
    //writin the pattern function in a other way
    static void pattern(int n){
    for (int row = 0; row < 2*n; row++) {
        int totalColsInRow = row>n?2*n-row:row;
            for (int col = 0; col <totalColsInRow ; col++) {
                System.out.print("* ");
            }

        System.out.println();
    }
}

}
