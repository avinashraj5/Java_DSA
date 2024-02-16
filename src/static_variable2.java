public class static_variable2 {
    static int count = 0; // before static its vale is same, after static it increases
    static_variable2(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        static_variable2 a = new static_variable2();
        static_variable2 b = new static_variable2();
        static_variable2 c = new static_variable2();
    }
}
