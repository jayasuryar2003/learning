package patterns;

public class Pattern23 {
//      *   *
//     * * * *
//    *   *   *

    public static void main(String[] args) {
        pattern(3);
    }

    static  void pattern(int n){
        for (int row = 1; row <= n; row++) {
           int star=n*n-row-5;
           int starEven=n-row+1;
            for (int col = 1; col <= n*n; col++) {
                if(row%2!=0&&col==star){
                    star=star+4;
                    System.out.print("*");
                }
                else if(row%2==0&&col==starEven){
                    starEven=starEven+2;
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
