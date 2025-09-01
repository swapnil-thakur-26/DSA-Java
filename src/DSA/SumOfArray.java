package DSA;

import java.util.Scanner;
import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //INPUT
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        //ELEMENTS
        System.out.println("Given array is: " + Arrays.toString(arr));

        //MAIN LOGIC
        int sum =0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        System.out.println("sum of these elements is : " + sum );
    }
}
