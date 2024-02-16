import java.util.* ;

public class array_practice {
}
class FindMaxElement {
    public static void main(String[] args) {
        // Example array
        int[] array = {5, 6, 7, 3, 6, 9, 22};
        // Find the maximum element
        int maxElement = findMaxElement(array);
        //Print the result
        System.out.println("The maximum element of the array is: " + maxElement);
    }

    private static int findMaxElement(int[] array) {
        // Check if the array is not empty
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        // Initialize maxElement with the first element of the array
        int maxElement = array[0];

        // Iterate through the array to find the maximum element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        // Return the maximum element
        return maxElement;
    }
    }
                                   //OR
        class MaxElement{
            public static void main(String[] args) {
                int [] arr = {5, 6, 7, 3, 6, 9, 22};
                int max = Integer.MIN_VALUE;
                for(int e: arr){
                    if(e>max){
                        max = e;
                    }
                }
                System.out.println("the value of the maximum element in this array is: "+ max);
            }
        }

    class SumOfArray {
        public static void main(String[] args) {
            //Initialize array
            int[] arr = new int[]{11, 2, 13, 4, 5};
            int sum = 0;
            //Loop through the array to calculate sum of elements
            for (int j : arr) {
                sum = sum + j;
            }
            System.out.println("Sum of all the elements of an array: " + sum);
        }
    }

    class sumOfArray2{
        public static void main(String[] args) {
            // Example array
            int[] array = {11, 2, 13, 4, 5};

            // Calculate the sum of elements
            int sum = calculateArraySum(array);

            // Print the result
            System.out.println("The sum of elements in the array is: " + sum);
        }

        // Function to calculate the sum of elements in an array
        private static int calculateArraySum(int[] array) {
            // Check if the array is not empty
            if (array.length == 0) {
                throw new IllegalArgumentException("Array is empty");
            }

            // Initialize sum to zero
            int sum = 0;

            // Use enhanced for loop to iterate through the array
            for (int element : array) {
                sum += element;
            }

            // Return the sum
            return sum;
        }
    }

    class FindElementIndex {
    public static void main(String[] args) {
        // Example array
        int[] array = {5, 12, 9, 3, 7, 22, 8};

        // Target element
        int targetElement = 7;

        // Find the index of the target element
        int index = findElementIndex(array, targetElement);

        // Print the result
        if (index != -1) {
            System.out.println("The index of " + targetElement + " is: " + index);
        } else {
            System.out.println(targetElement + " not found in the array.");
        }
    }

    // Function to find the index of a target element in an array
    private static int findElementIndex(int[] array, int targetElement) {
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is equal to the target element
            if (array[i] == targetElement) {
                // Return the index if found
                return i;
            }
        }

        // Return -1 if the target element is not found in the array
        return -1;
    }
}

class FindElementIndex2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(12);
        list.add(9);
        list.add(3);
        list.add(7);
        list.add(22);
        list.add(8);

        System.out.println(list.indexOf(22));
    }
    }

// Java Program to Remove Duplicate Elements
// From the Array using extra space

class RemoveDuplicate {
    public static int removeDuplicates(int[] a, int n)
    {
        // if(array size if 0 or 1 array is already sorted)
        if (n == 0 || n == 1) {
            return n;
        }

        int j = 0;

        // check if the ith element is not equal to
        // the (i+1)th element, then add that element
        // at the jth index in the same array
        // which indicates that te particular element
        // will only be added once in the array
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

        // the function will modify the array a[]
        // such that the starting j elements
        // will be having all unique elements
        // and no element will be appearing more than
        // once
        j = removeDuplicates(a, n);

        // printing array elements
        for (int i = 0; i < j; i++)
            System.out.print(a[i] + " ");
    }
}
//OR
// Java Program to Remove Duplicate Elements
// From the Array using Set
class RemoveDuplicate2 {

    // Function to remove duplicate from array
    public static void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set
                = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet
        for (int i : a)
            set.add(i);

        // Print the elements of LinkedHashSet
        System.out.print(set);
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] a = {5,2,6,8,6,7,5,2,8};

        // Function call
        removeDuplicates(a);
    }
}

class RotateRight {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 5};
        //n determine the number of times an array should be rotated.
        int n = 3;

        //Displays original array
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Rotate the given array by n times toward right
        for(int i = 0; i < n; i++){
            int j, last;
            //Stores the last element of array
            last = arr[arr.length-1];

            for(j = arr.length-1; j > 0; j--){
                //Shift element of array by one
                arr[j] = arr[j-1];
            }
            //Last element of array will be added to the start of array.
            arr[0] = last;
        }

        System.out.println();

        //Displays resulting array after rotation
        System.out.println("Array after right rotation: ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


