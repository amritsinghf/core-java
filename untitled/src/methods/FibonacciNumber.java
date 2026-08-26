package methods;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        fibonaaciNumber(num);
    }

    public static void fibonaaciNumber(int num){
        int first = 0;
        int second = 1;
        int i = 1;
        while(i<=num){
            System.out.println(first);
            int third = first + second;
            first = second;
            second = third;

            i++;
        }
    }
}
