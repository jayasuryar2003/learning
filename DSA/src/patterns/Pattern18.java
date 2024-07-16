package patterns;

public class Pattern18 {
//    **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********
public static void main(String[] args) {
pattern(5);
}
static void pattern(int n) {
    for (int row = 0; row < 2 * n-1 ; row++) {
        for (int col = 0; col < 2 * n; col++) {
            if (row < n) {
                if(col<n-row||col>=n+row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            else{
                if(col<=row-n+1||col>=3*n-row-2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        System.out.println();


    }




    }

}

