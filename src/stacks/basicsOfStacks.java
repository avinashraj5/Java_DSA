package stacks;
import java.util.*;

public class basicsOfStacks {
    public static void main(String[] args) {
        //int[] arr = new int[5];   for array
        //ArrayList<Integer> arr = new ArrayList<>();   for arraylist
        //LinkedList<Integer> arr = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        System.out.println("Size is : "+st.size());
        System.out.println(st);
        st.push(2);
        System.out.println("Size is : "+st.size());
        System.out.println(st);
        st.push(23);
        System.out.println("Size is : "+st.size());
        System.out.println(st);
        st.push(30);
        System.out.println("Size is : "+st.size());
        System.out.println(st);
        st.push(90);
        System.out.println("Size is : "+st.size());
        System.out.println(st);
        st.push(54);
        System.out.println("Size is : "+st.size());
        System.out.println(st);
//        System.out.println(st.peek());
//        System.out.println(st);
//        //st.pop();
//        //System.out.println(st);
//        System.out.println("Size is : "+st.size());
//        while (st.size()>1){
//            st.pop();
//        }
//        System.out.println(st.peek());
    }
}
