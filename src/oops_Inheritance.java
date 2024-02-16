public class oops_Inheritance { // Parent class or Super class
    void eat(){ // method
        System.out.println("I am eating");
    }
}
class dog extends oops_Inheritance{ // Child class or sub_class
    public static void main(String[] args) {
        dog d = new dog(); // create the object of dog class
        d.eat();
    }
}
