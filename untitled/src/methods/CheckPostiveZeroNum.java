package methods;

import java.util.Scanner;

public class CheckPostiveZeroNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        checkPosNegZeroNumber(num);
    }

    public static void checkPosNegZeroNumber(int num){
        String result = num == 0 ? "Zero" : num<0 ? "Negative" : "Positive";

        System.out.println(num + " is a " + result + " number.");

    }
}
