package methods;

import java.util.Scanner;

public class CubeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num = sc.nextInt();

        int cubeRes = cubeNumber(num);
        System.out.println(cubeRes);
    }

    public static int cubeNumber (int num){
        return num*num*num;
    }
}
