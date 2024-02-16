abstract class oops {
    abstract void start();
}
class jeep extends oops{
    void start(){
        System.out.println("Starts with key");
    }
}
class scooter extends oops {
    void start() {
        System.out.println("Start with kick");
    }

}
class oops_Abstraction{
    public static void main(String[] args) {
//        jeep a = new jeep();
//        a.start();
        oops b = new scooter();
        b.start();
    }}
