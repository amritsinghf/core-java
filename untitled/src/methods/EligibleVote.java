package methods;

import java.util.Scanner;

public class EligibleVote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a age: ");
        int age = sc.nextInt();

        checkAge(age);
    }

    public static void checkAge(int num){
        if(num > 18){
            System.out.println(num + " is eligible for vote.");
        }else{
            System.out.println(num + " is not eligible for vote.");
        }
    }
}
