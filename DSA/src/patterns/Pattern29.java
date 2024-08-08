package patterns;

public class Pattern29 {

//     *________*
//     **______**
//     ***____***
//     ****__****
//     **********
//     ****__****
//     ***____***
//     **______**
//     *________*
    public static void main(String[] args) {
        patter(5);
    }
    static void patter(int n){
        for (int row = 0; row < 2*n-1; row++) {
            for (int col = 0; col < 2*n; col++) {
                if(n>row) {
                    if (col == 0 || col == 2 * n - 1 || row >= col||col>=2*n-row-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                else {
                    if (col == 0 || col == 2 * n - 1 || col<2*n-row-1||col>=row+1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
