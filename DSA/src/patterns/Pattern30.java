package patterns;

public class Pattern30 {
//            1
//           212
//          32123
//         4321234
//        543212345
public static void main(String[] args) {
    pattern(5);
}

static  void pattern(int n){
    for (int row = 1; row <= n; row++) {
        for (int col =n ; col > 0 ; col--) {
//            <------- Give importance here
            if (col<=row) {
                System.out.print(col);
            }
            else{
                System.out.print(" ");
            }
        }
        for (int col =2 ; col <= row ; col++) {
            System.out.print(col);
        }
        System.out.println();
    }
}

}
