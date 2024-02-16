package Striver_DSA;

public class RotateArray_Right {
    public static void reverse(int[] arr, int n, int k){
        k %= arr.length;
        rotate(arr, 0, n - 1);
        rotate(arr, 0, n - k);
        rotate(arr, k, n - 1);
    }
    public static void rotate(int[] arr, int start, int end){
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,};
        int n = arr.length;
        int k = 3;
        reverse(arr, n, k);
        System.out.print("After rotating an array:");
        for (int i : arr) {
            System.out.print(i + " ");
            System.out.print(" ");
        }
    }
}

class RotateArray_Left {
    public static void reverse(int[] arr, int n, int k){
        k %= arr.length;
        rotate(arr, 0, k - 1);
        rotate(arr, k, n - 1);
        rotate(arr, 0, n - 1);
    }
    public static void rotate(int[] arr, int start, int end){
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,};
        int n = arr.length;
        int k = 3;
        reverse(arr, n, k);
        System.out.print("After rotating an array:");
        for (int i : arr) {
            System.out.print(i + " ");
            System.out.print(" ");
        }
    }
}

