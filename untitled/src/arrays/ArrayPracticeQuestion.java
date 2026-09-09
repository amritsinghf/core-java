package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of elements: ");
        int num = sc.nextInt();

        int [] arr = new int[num];

        for(int i = 0; i<num;i++){
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
