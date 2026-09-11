package arrays;

import java.util.Scanner;

public class MaximumNumInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int num = sc.nextInt();

        int [] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        maximumNumber(arr);
    }

    public static void maximumNumber(int [] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
