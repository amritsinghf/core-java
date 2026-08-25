package methods;

import java.util.Scanner;

public class DivisionOfTwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter a second number: ");
        int num2 = sc.nextInt();

        double divisionNumber = division(num1, num2);
        System.out.println(divisionNumber);
    }

    public static double division(int num1, int num2){
        if(num2 == 0) throw new IllegalArgumentException("Cannot divide by zero.");


        return (double) num1/ num2;

    }
}
