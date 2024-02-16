import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class DSA_array {}

    class largest_element{
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,2};
        int largest = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}

class largestElement{
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,4,9,9,5,4};
        System.out.println("Largest element in Array is: "+sort(arr));
    }
    static int sort(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}

class largest_element1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for (int i=0; i<n; i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("The largest element of the array is: "+largest);
        sc.close();
    }
}

class second_largest_element{
    public static void main(String[] args){
        int[] arr = {3,2,5,9,4,6,9,4};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != largest) {

                second = Math.max(second, arr[i]);
            }
        }
        System.out.print(largest);
    }
}

class second1{
    public static void main(String[] args) {
        int[] arr = {7,7,6,5,4,3,2};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i=0; i< arr.length; i++){
            if (arr[i]>largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest){
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}

class second2{
    public static void main(String[] args) {
        int[] arr = {2,6,4,8,9,6,9};
        Arrays.sort(arr);
        int n = arr.length;
        System.out.print(arr[n-2]);
    }
}

class second_largest_element2{
    public static void main(String[] args){
        int[] arr = {3,2,5,9,4,6,9,4};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        for (int j : arr) {
            if (j != largest) {

                second = Math.max(second, j);
            }
        }
        System.out.print(largest+" " +second);
        //System.out.println(" " +second);
    }
}

/*class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 9, 4, 6, 9, 4};
        int secondLargest = findSecondLargest(arr, 0, Integer.MIN_VALUE, Integer.MIN_VALUE);
        System.out.println(secondLargest);
    }

    private static int findSecondLargest(int[] arr, int index, int largest, int secondLargest) {
        if (index == arr.length) {
            return secondLargest;
        }

        if (arr[index] > largest) {
            secondLargest = largest;
            largest = arr[index];
        } else if (arr[index] > secondLargest && arr[index] != largest) {
            secondLargest = arr[index];
        }

        return findSecondLargest(arr, index + 1, largest, secondLargest);
    }
}*/

class sortedElement{
    public static void main(String[] args) {
        int[] arr = {6,4,3,2,4,4,3,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
 class sortedRecursion{
    public static int sort(int[] arr) {
        for (int i=0; i< arr.length-1; i++){
            if (arr[i] > arr[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
     public static void main(String[] args) {
         int[] arr = {6, 4, 3, 2, 4, 4, 3, 9};
         int result = sort(arr);
         if (result == 1){
             System.out.println("The array is sorted.");
         }
         else {
             System.out.println("The array is not sorted.");
         }
         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));
     }
 }

class SortedOrNot{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 6};
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
            }
        if (isSorted){
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }

    }
}

class SortedOrNot2 {
    static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(isSorted(arr));
    }
}


class removeD{
    public static void main(String[] args) {
        int[] arr = {2,2,2,4,5,6,6,4,9,9};
//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");}
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j< arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[i] = -1;
                    Arrays.sort(arr);
                }
            }
        }
//        System.out.println();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != -1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

class removeD2{
    public static int removeDuplicates(int[] a, int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n - 1];
        return j;
    }
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 };
        int n = a.length;
        int j=0;
        j = removeDuplicates(a, n);
        for (int i = 0; i < j; i++)
            System.out.print(a[i] + " ");
    }
}

class A{
    public static int removeD(ArrayList<Integer>arr, int n){
        int prev = Integer.MAX_VALUE, index = 0;
        for(int x:arr) {
            if (prev != x) {
                prev = x;
                arr.set(index++, x);
            }
        }
        return index;
            }
        }






