public class oops_this_super {
    int a = 10;
}
class Bye extends oops_this_super{
    int a = 20;
    void show(int a){
        System.out.println(a);
        System.out.println(this.a); // this keyword------refers current class instance variable.
        System.out.println(super.a);  // super keyword-----refers for superclass (parent) object.
    }

    public static void main(String[] args) {
        Bye object = new Bye();
        object.show(30);
    }
}
