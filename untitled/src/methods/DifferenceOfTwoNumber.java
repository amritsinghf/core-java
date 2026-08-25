package methods;

import java.util.Scanner;

public class DifferenceOfTwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a second number: ");
        int num2 = sc.nextInt();

        int res = differenceOfTwoNumber(num1, num2);
        System.out.println(res);
    }

    public  static int differenceOfTwoNumber(int num1, int num2){
        int difference;

        if(num1 > num2){
            difference = num1 - num2;
        }else{
            difference = num2 - num1;
        }

        return difference;
    }
}
