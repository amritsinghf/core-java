package methods;

import java.util.Scanner;

public class LeapNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        checkLeapYear(year);
    }

    public static void checkLeapYear(int num){
     String result = (num%400 ==0 || (num%4==0 && num%100 !=0)) ? num + " is a leap year." : num + " is not a leap year.";

        System.out.println(result);
    }
}
