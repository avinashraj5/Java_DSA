package Striver_DSA;

import java.util.Arrays;

public class FindMissingNumber {
    public static int missing(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == arr[i]) continue;
            else return a[i];
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = arr.length;
        System.out.print("Missing Number is:" + missing(arr));
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(i+" ");
        }
    }
}

class findmissingnum{
    public static int missingNumber(int []a, int N) {

        // Outer loop that runs from 1 to N:
        for (int i = 1; i <= N; i++) {

            // flag variable to check
            //if an element exists
            int flag = 0;

            //Search the element using linear search:
            for (int j = 0; j < N - 1; j++) {
                if (a[j] == i) {

                    // i is present in the array:
                    flag = 1;
                    break;
                }
            }

            // check if the element is missing
            //i.e flag == 0:

            if (flag == 0) return i;
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}

class Solution {
    public int missingNumber1(int[]nums) {
        //Step1: Find the length of array.
        int n = nums.length;

        //Step2: Calculate the actual sum using Mathematical formulae
        long actualSum = (n*(n+1))/2;

        //Step3: Calculate the given sum.
        long sum = 0;
        for(int element: nums)
        {
            sum += element;
        }

        //Step 4: return actualSum-givenSum.
        return (int)(actualSum-sum);
    }

    public static void main(String[] args) {
        int[] sum = {1,2,3,4,6};
        //int ans =
    }
}
