package Striver_DSA;

import java.util.Arrays;

public class FindMaxConsecutiveOnes {
    static int findMaxConsecutiveOnes(int[] arr) {
        int cnt = 0;
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            if (cnt>maxi){
                maxi = cnt;
            }
        }
        return maxi;
    }
    public static void main(String args[]) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int ans = findMaxConsecutiveOnes(arr);
        System.out.println("The maximum  consecutive 1's are " + ans);
    }
}

class a{
    public static void check(int[] arr) {
        int cnt = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
        }
        if (cnt > temp) {
            temp = cnt;
        }
            System.out.println("The max count are: " + temp);
        }
    public static void main(String[] args) {
        int[] arr = {8,3,6,1,1,1,1};
        int n = arr.length;
        check(arr);
    }
}
