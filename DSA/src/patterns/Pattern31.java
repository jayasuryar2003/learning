package patterns;

public class Pattern31 {
    //     4 4 4 4 4 4 4
    //     4 3 3 3 3 3 4
    //     4 3 2 2 2 3 4
    //     4 3 2 1 2 3 4
    //     4 3 2 2 2 3 4
    //     4 3 3 3 3 3 4
    //     4 4 4 4 4 4 4
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        int size = 2 * n - 1;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                int min = Math.min(Math.min(row, col), Math.min(size - row - 1, size - col - 1));
                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
    }
}

