package Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word or number");
        String word = input.nextLine();
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--){
            reversed += word.charAt(i);
        }
        if(word.equalsIgnoreCase(reversed)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
