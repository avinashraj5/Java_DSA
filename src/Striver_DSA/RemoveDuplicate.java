package Striver_DSA;

import java.util.Arrays;

public class RemoveDuplicate {
    public static int removeD(int[] arr, int n){
        int j=0;
        for (int i=0; i<n; i++){
            if (arr[j] != arr[i]){
                arr[++j] = arr[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2,2,2,6,6,7,9};
        int n = arr.length;
        int result = removeD(arr, n);
        Arrays.sort(arr, 0, result);
        for (int i=0;i<result;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
