package Striver_DSA;

import java.util.Arrays;

public class LeftRotateArray_One {
   public static void rotate(int[] arr){
        int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i<n-1; i++){
            arr[i] = arr[i+1];
            }
        arr[n-1] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        System.out.print("Array Element:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        rotate(arr);
        System.out.println();
        System.out.print("Rotated Array:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
