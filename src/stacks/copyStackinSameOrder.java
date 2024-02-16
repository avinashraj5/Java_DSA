package stacks;
import java.util.*;

public class copyStackinSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the number of Elements : ");
        n= sc.nextInt();
        System.out.println("Enter the Elements : ");
        for (int i=1; i<=n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}

class copyStackinSameOrder2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(5);
        st.push(8);
        st.push(20);
        st.push(46);
        System.out.println(st);
        //reverse order
        Stack<Integer> gt = new Stack<>();
        while (st.size()>0){
            gt.push(st.pop());
        }
        Stack<Integer> rt = new Stack<>();
        while (gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}

class insertionInStack{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(5);
        st.push(8);
        st.push(20);
        st.push(46);
        System.out.println(st);
        int idx = 2;
        int x = 7;
        Stack<Integer> temp = new Stack<>();
        while (st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while (temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}

class DisplayStack{
    public static void displayReverseRecurs(Stack<Integer> st){
        if (st.size() == 0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverseRecurs(st);
        st.push(top);
    }
    public static void displayRecurs(Stack<Integer> st){
        if (st.size() == 0) return;
        int top = st.pop();
        displayRecurs(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayRecurs(st);
//        Stack<Integer> rt = new Stack<>();
//        while (st.size()>0){
//            rt.push(st.pop());
//        }
//        while (rt.size()>0){
//            int x= rt.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }
//        int n = st.size();
//        int[] arr = new int[n];
//        for (int i=n-1; i>=0; i--){
//            arr[i] = st.pop();
//        }
//        for (int i=0; i<n; i++){
//            System.out.print(arr[i]+" ");
//            int x = arr[i];
//            st.push(x);
//        }
//        System.out.println(st);
    }
}

class pushBottom{
    static void pushAtBottom(Stack<Integer> stack , int element){
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }

        int topElement = stack.pop();
        pushAtBottom(stack, element);
        stack.push(topElement);
    }
    public static void displayReverseRecurs(Stack<Integer> st){
        if (st.size() == 0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverseRecurs(st);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayReverseRecurs(st);
    }
}

class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }

    // Recursive method to reverse the stack
    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Remove the top element
            int temp = stack.pop();

            // Recursively reverse the remaining elements
            reverseStack(stack);

            // Insert the top element at the bottom
            insertAtBottom(stack, temp);
        }
    }

    // Recursive method to insert an element at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            // If the stack is empty, simply push the item
            stack.push(item);
        } else {
            // Remove the top element
            int temp = stack.pop();

            // Recursively insert the item at the bottom
            insertAtBottom(stack, item);

            // Push the top element back
            stack.push(temp);
        }
    }
}


