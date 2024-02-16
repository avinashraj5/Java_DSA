public class static_method {
    static void display(){
        System.out.println("yes");
    }
    void test(){
        System.out.println("no");
    }

    public static void main(String[] args) {
        static_method a = new static_method();
        a.test();
        static_method.display(); // we can also call it through directly display(); within in class
    }
}
class xyz{
    static void main(){
        System.out.println("what");
    }

    public static void main(String[] args) {
        xyz.main();
    }
}
