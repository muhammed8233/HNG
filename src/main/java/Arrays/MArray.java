package Arrays;

public class MArray {
    public static void main(String[] args) {
        int counter = 0;
        int[][] array = {{1, 2, 3, 4, 5, 6},{1, 2, 3, 4, 5, 6}};

        for (int i = 0; i <= 2; i++) {
            for (int row = 0; row < array[0].length; row++) {
                System.out.print(" x ");
            }
            System.out.println();
            System.out.println("__________________");
            for (int column = 0; column < array[1].length; column++) {
                System.out.print(" 0 ");
            }
            System.out.println();
            System.out.println("__________________");
        }
    }
}
