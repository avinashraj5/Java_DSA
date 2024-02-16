public class oops_Polymorphism { //   Method Overloading
    void same(){
        System.out.println("1");
    }
    void same(int a){
        System.out.println("2");
    }
    void same(int a, String b){
        System.out.println("3");
    }

    public static void main(String[] args) {
        oops_Polymorphism t = new oops_Polymorphism();
        t.same();
        t.same(10);
        t.same(10,"son");   //  Compiled time polymorphism through method overloading
    }
}
