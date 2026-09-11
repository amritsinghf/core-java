package arrays;

import java.util.Scanner;

public class RotateNumberKTimes {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a numner: ");
        int num = in.nextInt();

        System.out.print("Enter a rotate times number: ");
        int rotateNum = in.nextInt();


        rotateKTimes(num, rotateNum);
    }

    public static void rotateKTimes(int num, int k){
        int digit = 0;
        int temp = num;
        int power = 1;

        while(temp > 0){
            temp = temp / 10;
            digit++;
        }

        k = k % digit;

        if(k<0){
            k = k+digit;
        }
        for (int i = 1; i < digit; i++) {
            power = power * 10;
        }


        for (int i = 0; i < k; i++) {
            int lastDigit = num % 10;
            num = num/10;
            num = (lastDigit * power) + num;
        }
        System.out.println(num);
    }
}
