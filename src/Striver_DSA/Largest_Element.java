package Striver_DSA;

import java.util.Arrays;

public class Largest_Element {
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,4,9,9,5,4};
        System.out.println("Largest element in Array is: "+sort(arr));
    }
    static int sort(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}

class LargestElement_Recursion {
    public static void main(String[] args) {
        int[] arr1 =  {2,5,1,3,0};
        System.out.println("The Largest element in the array is: "+findLargestElement(arr1));
        int[] arr2 =  {8,10,5,7,9};
        System.out.println("The Largest element in the array is: "+findLargestElement(arr2));
    }
    static int findLargestElement(int[] arr) {
        int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max= arr[i];
            }
        }
        return max;
    }
}

