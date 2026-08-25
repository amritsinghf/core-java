package methods;

import java.util.Scanner;

public class ProductOfTwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter a second number: ");
        int num2 = sc.nextInt();

        int product = productNumber(num1, num2);
        System.out.println(product);
    }

    public static int productNumber(int num1, int num2){
       return num1 * num2;
    }
}
