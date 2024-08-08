package patterns;

public class Pattern22 {
//       1
//       01
//       101
//       0101
//       10101
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row+1; col++) {
                if(row%2==0){
                    if(col%2==0){
                        System.out.print(1);
                    }
                    else {
                        System.out.print(0);
                    }

                }
                else {
                    if(col%2==0){
                        System.out.print(0);
                    }
                    else {
                        System.out.print(1);
                    }
                }
            }


            System.out.println();
        }
    }


}
//public class Pattern22 {
//    public static void main(String[] args) {
//        int n = 5; // Number of lines
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                // Print 1 if the sum of indexes is odd, else print 0
//                if ((i + j) % 2 == 0) {
//                    System.out.print("0");
//                } else {
//                    System.out.print("1");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

