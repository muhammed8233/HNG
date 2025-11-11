package Arrays;

public class MArray {
    public static void main(String[] args) {
        String[][] array = new String[6][6];

        String fillValue = "null";
        for (int row = 0; row < array.length; row++) {
            if (row % 2 == 0) {
                fillValue = " x ";
            }else {
                fillValue = " 0 ";
            }
            for (int column = 0; column < array.length; column++) {
                System.out.print(array[row][column] = fillValue);
            }
            System.out.println();
        }
    }
}
