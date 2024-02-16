abstract class Parent{
    public Parent(){
        System.out.println("I am a constructor of Base");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet1();
}
class child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet1(){
        System.out.println("Good Morning");
    }
}

abstract class child1 extends Parent{
    public void th(){
        System.out.println("I am Good");
    }
}
public class abstract_pr {
    public static void main(String[] args) {
       // Parent p = new Parent(); --error
        child c = new child();
       // child1 d = new child1(); --error
    }
}
