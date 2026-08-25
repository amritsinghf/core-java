package methods;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();


        checkEvenOdd(num);

    }

    public static void checkEvenOdd(int num){

//        for (int i = 0; i <= num; i++) {
//            if(i%2==0){
//                System.out.println(i + " is a even number.");
//            }else{
//                System.out.println(i + " is a odd number.");
//            }
//        }

        int i = 1;

        while(i<=num){
            if(i%2==0){
                System.out.println(i + " is a even number.");
            }else{
                System.out.println(i + " is a odd number.");
            }

            i++;
        }
    }
}
