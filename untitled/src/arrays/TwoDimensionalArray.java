package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the size of row array: ");
        int row = in.nextInt();
        
        int [][] arr = new int[row][];

        // Managing the size of column
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i+1) + " col size : " );
            int col = in.nextInt();
            arr[i] = new int[col];
        }


        for (int i = 0; i<arr.length; i++){
            // for each col in every row
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the number " + (i+1) + " of that column: ");
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }


     }
}
