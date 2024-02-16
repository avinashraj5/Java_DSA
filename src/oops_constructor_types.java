public class oops_constructor_types { //Default constructor (Compiler create default constructor)
    int i;
    String s;
    public static void main(String[] args) {
        oops_constructor_types t = new oops_constructor_types();
        System.out.println(t.i+" "+t.s);
    }
}

class test{ //No Argument constructor
    test(){
        System.out.println("No arguments constructor");
    }
    public static void main(String[] args) {
        test t = new test();
    }
}

class test2{ //Parametrized constructor
    test2(int a){
        System.out.println("parametrized constructor");
    }
    public static void main(String[] args) {
        test2 t = new test2(10);
    }
}
