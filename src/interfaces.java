interface Bicycle{
    int a = 45;
    void appliedBrake(int decrement);
    void SpeedUp(int increment);
}
interface HornBicycle{
    int b = 55;
    void blowHorn();
    void BlowSpeed();
}
class avonCycle implements Bicycle, HornBicycle{
    public void appliedBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void SpeedUp(int increment){
        System.out.println("Applying Accelerator");
    }
    public void blowHorn(){
        System.out.println("Blow Horn");
    }
    public void BlowSpeed(){
        System.out.println("Blow Speed");
    }
}
public class interfaces {
    public static void main(String[] args) {
        avonCycle c = new avonCycle();
        c.appliedBrake(1);
        // You can create properties in interfaces
        System.out.println(c.a);
        // You cannot modify the properties in Interfaces as they are final
        // c.a = 454;
        c.blowHorn();
        c.BlowSpeed();
        System.out.println(c.b);

    }
}
