public class oops_Inheritance_types {
    void showA(){
        System.out.println("a class method");
    }
}
class B extends oops_Inheritance_types {
    void showB() {
        System.out.println("b class method");
    }
}
class C extends oops_Inheritance_types{
        void showC(){
            System.out.println("c class method");
        }

    public static void main(String[] args) {
        oops_Inheritance_types a = new oops_Inheritance_types();
        a.showA();
        //a.showB();
        System.out.println("---------------");
        B b = new B();
        b.showA();
        b.showB();
        System.out.println("---------------");
        C c = new C();
        c.showA();
        //c.showB();
        c.showC();

    }
}
