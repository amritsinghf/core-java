package methods;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter a second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter a third number: ");
        int n3 = sc.nextInt();

        int maxNum = maximumNumber(n1, n2, n3);
        System.out.println(maxNum);
    }

    public static int maximumNumber(int n1, int n2, int n3){
        int max = n1;

        if(n2 > max){
            max = n2;
        }

        if(n3 > max){
            max = n3;
        }
        return max;
    }
}
