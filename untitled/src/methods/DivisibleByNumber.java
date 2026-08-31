package methods;

import java.util.Scanner;

public class DivisibleByNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();


        checkDivisibleByNumber(num);
    }

    public static void checkDivisibleByNumber(int num){
        if(num % 3 == 0 && num%5==0 ){
            System.out.println(num + " is a divisible by 3 and 5");
        }else{
            System.out.println(num + " is not divisible by 3 and 5");
        }
    }
}
