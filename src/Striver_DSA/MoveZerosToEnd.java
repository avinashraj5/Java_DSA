package Striver_DSA;

public class MoveZerosToEnd {
    public static int[] move(int[] arr){
        int j = -1;
        for (int i=0; i< arr.length; i++){
            if (arr[i]==0){
                j = i;
                break;
            }
        }
        // no-non zero element
        if (j == -1) {
            return arr;
        }
            //Move the pointers i and j
            //and swap accordingly:
            for (int i=j+1; i< arr.length; i++){
                if (arr[i] != 0){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,0,8,0,9,0,0,1};
        
        int[] check = move(arr);
        for (int i:check){
            System.out.print(i+" ");
        }
        //System.out.println("");
    }
}
