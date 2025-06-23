package devdojologic.loops;

import java.util.Scanner;

public class E14DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wishToContinue = 1;

        do {
            System.out.println("Player 1: type a number between 1 to 10:");
            int num1 = input.nextInt();
            System.out.println("Player 2: type a number between 1 to 10:");
            int num2 = input.nextInt();
            System.out.println("Player 2 answer " + (num1 == num2));
            System.out.println("-----------------------------------");
            System.out.println("Wish to continue? 1. Yes  2. No");
            wishToContinue = input.nextInt();
        } while (wishToContinue == 1);
    }
}
