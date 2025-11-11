package Task;
public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        int sum = 0;

            int raiseToPower = number % 10;
            double value = Math.pow(number, raiseToPower);
            sum += (int)value;
            if(number == sum){
             return true;
            }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
    }

}
