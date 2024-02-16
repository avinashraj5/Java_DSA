public class oops1 {
    public void eat() {
        System.out.println("I am eating");
        String color;
        int age;
    }

    public static void main(String[] args) {
        System.out.println("1");
        oops1 cat = new oops1();
        cat.eat();
        oops1 dog = new oops1();
        dog.run();
        oops1_1 parrot = new oops1_1();
        parrot.fly();

    }

    public void run() {
        System.out.println("I am running");
    }
}
    class oops1_1 {
        void fly(){
            System.out.println("I am flying");
        }
    }
