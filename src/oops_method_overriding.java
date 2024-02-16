class demo {
    void sample() {
        System.out.println("Method of the super class");
    }
}
class oops_Polymorphism_overriding extends demo {
    void sample() {
        super.sample();
        System.out.println("Method of the sub class");
    }
}
class oops_method_overriding{
    public static void main(String args[]) {
        demo obj1 = new oops_Polymorphism_overriding();
        obj1.sample();
    }
}
