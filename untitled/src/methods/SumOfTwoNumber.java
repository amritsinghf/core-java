package methods;

import java.util.Scanner;

public class SumOfTwoNumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int n2 = input.nextInt();

        int sum = n1 + n2;

        System.out.println("The sum is " + sum);
    }
}
