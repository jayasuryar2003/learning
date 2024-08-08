package patterns;

public class Pattern24 {
//     *________*
//     **______**
//     *_*____*_*
//     *__*__*__*
//     *___**___*
//     *___**___*
//     *__*__*__*
//     *_*____*_*
//     **______**
//     *________*
    public static void main(String[] args) {
     pattern(5);
    }
    static void pattern(int n){
        for (int row = 0; row < 2*n; row++) {
            for (int col = 0; col < 2*n; col++) {
                   if(col==0||col==2*n-1||col==row||col==2*n-row-1){
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
