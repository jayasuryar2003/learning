package patterns;

public class Pattern19 {
    public static void main(String[] args) {
     pattern(5);
    }
    static void pattern(int n){
        for (int row = 0; row < 2*n-1; row++) {
            for (int col = 0; col < 2*n; col++) {
                if(row<=n-1) {
                    if (col <= row || col >= 2 * n - row - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                else{
                    if(col<2*n-row-1||col>row){
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
