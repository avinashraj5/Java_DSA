package Striver_DSA;

public class SecondLargestElement {
    public static int second(int[] arr){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>largest){
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,7,7,1};
        // Print the array elements
        System.out.print("Array elements: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();  // Add a newline for better formatting
        // Find and print the second-largest element
        System.out.println("The second largest element is: " + second(arr));
    }
}
