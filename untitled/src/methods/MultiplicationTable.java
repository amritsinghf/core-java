package methods;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        multiplication(num);
    }

    public static void multiplication(int num){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(num + " x " +  i + " = " + num*i);
        }
    }
}
