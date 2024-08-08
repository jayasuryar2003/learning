package patterns;

public class Pattern27 {
//    1 2 3 4  17 18 19 20
//      5 6 7  14 15 16
//        8 9  12 13
//          10 11
public static void main(String[] args) {
pattern(4);
}
static void pattern(int n){
    int start=0;
    int end=n*n;
    int count=n;
    for (int row = 1; row <= n; row++) {
        if(row>1) {
            for (int colSpace = 1; colSpace <= (row-1)*2; colSpace++) {
                System.out.print(" ");
            }
        }
        for (int colNumAes = 0; colNumAes < n-row+1; colNumAes++) {
            System.out.print(++start + " ");
        }
        int tempEnd = end+1;
        for (int colNumAes = 0; colNumAes < n-row+1; colNumAes++) {
            System.out.print(" "+ ++end);
        }
        end=tempEnd-count--;
        System.out.println();
    }
}
}
