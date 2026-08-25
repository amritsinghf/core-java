package methods;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first num: ");
        int num1 = sc.nextInt();

        int squareNumRes = squareNumber(num1);

        System.out.println(squareNumRes);
    }
    public static int squareNumber(int num1){
        return num1 * num1;
    }
}
