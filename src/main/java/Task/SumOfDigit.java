package Task;

import java.util.Scanner;

public class SumOfDigit {


    public static int sum(int num) {
        int sum = 0;
        for (int i = num; i > 0; i--) {
            int digit = num  % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        System.out.println(sum(number));
    }
}