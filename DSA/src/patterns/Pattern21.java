package patterns;

public class Pattern21 {

//    1
//    2  3
//    4  5  6
//    7  8  9  10
//    11 12 13 14 15
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        int count=0;
        for (int row = 0; row <n ; row++) {
            for (int col = 0; col < row+1; col++) {
                System.out.print(++count +"  ");
            }
            System.out.println();
        }
    }
}
