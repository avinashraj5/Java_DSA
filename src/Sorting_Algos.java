public class Sorting_Algos {
}
class Bubble1{
    public static void main(String[] args) {
        int arr[] = {36,19,29,12,5};
        int temp;
        for (int i=0; i<arr.length-1; i++){
            int flag=0;
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag =1;
                }
            }
            if (flag==0){
                break;
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//STRING
class Bubble2{
    public static void main(String[] args) {
        String arr[] = {"Avinash","Omkar","Shrihari","Pratik","Sudeep"};
        String temp;
        for (int i=0; i<arr.length-1; i++){
            int flag=0;
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j].compareTo(arr[j+1])>0){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag =1;
                }
            }
            if (flag==0){
                break;
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class Bubble_Recur {
    public static void printarray(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {18,5,19,68,1};

        //bubble sort
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j< arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printarray(arr);
    }
}

class Selection1{
    public static void printarray(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {18,5,19,68,1};

        //selection sort
        for (int i=0; i<arr.length-1; i++){
            int smallest = i;
            for (int j=i+1; j< arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printarray(arr);
    }
}

class Insertion1{
    public static void printarray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4,2,1,15,18,5};
        int temp, j;
        for (int i=1; i<arr.length;i++){
            temp = arr[i];
            j=i;
            while ((j>0) && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }
        printarray(arr);
    }
}

class merge{
    public static void conquer(int[] arr, int si, int mid, int ei){
        int[] merge = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while (idx1<=mid && idx2<=ei){
            if (arr[idx1]<=arr[idx2]){
                merge[x++] = arr[idx1++];
            }
            else {
                merge[x++] = arr[idx2++];
            }
        }
        while (idx1<=mid){
            merge[x++] = arr[idx1++];
        }
        while (idx2<=ei){
            merge[x++] = arr[idx2++];
        }
        for (int i=0, j=si; i< merge.length; i++, j++){
            arr[j] = merge[i];
        }
    }
        public static void divide(int arr[], int si, int ei){
            if (si>=ei){
                return;
            }
            int mid = si + (ei - si) / 2;
            divide(arr, si, mid);
            divide(arr, mid+1, ei);
            conquer(arr, si, mid, ei);
        }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr, 0, n-1);
        //print
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

class quick{
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j=low; j<high; j++){
            if (arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i; //pivot index
    }
    public static void quicksort(int[] arr, int low, int high){
        if (low<high){
            int pivotdx = partition(arr, low, high);

            quicksort(arr, low, pivotdx-1);
            quicksort(arr, pivotdx+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;
        quicksort(arr, 0, n-1);

        //print
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
