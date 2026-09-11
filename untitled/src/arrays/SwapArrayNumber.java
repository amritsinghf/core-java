package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArrayNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int num = sc.nextInt();

        int [] arr = new int [num];

        for (int i = 1; i <= arr.length; i++) {
            System.out.print("Enter the " + i + " index of num: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the first index: ");
        int firstIndex = sc.nextInt();

        System.out.print("Enter the second index: ");
        int secondIndex = sc.nextInt();

        int [] result = swapArray(arr, firstIndex, secondIndex);
        System.out.println(Arrays.toString(result));
    }

    public static int [] swapArray(int [] arr, int i, int j){
        for (int k = 0; k < arr.length; k++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }
}
