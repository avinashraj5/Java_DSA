package Striver_DSA;

public class LinearSearch {
    public static int search(int[] arr, int num){
        for (int i=0; i<arr.length;i++){
            if (arr[i]==num) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,6,5,8};
        int num = 3;
        int val = search(arr, num);
        System.out.println(val);
    }
}
