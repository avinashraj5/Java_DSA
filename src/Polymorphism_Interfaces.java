interface MyCamera1{
    void TakeSnap();
    void RecordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void Record4KVideos(){
        greet();
        System.out.println("Recording in 4K");
    }
}
interface MyWiFi1{
    String[] GetNetworks();
    void ConnectToNetwork(String network);
}
class MyCellPhone1{
    void CallNumber(int PhoneNumber){
        System.out.println("Calling"+ PhoneNumber);
    }
    void PickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone1 extends MyCellPhone implements MyWiFi1, MyCamera1{
    public void TakeSnap(){
        System.out.println("Taking Snap");
    }
    public void RecordVideo(){
        System.out.println("Record Video");
    }
    public String[] GetNetworks(){
        System.out.println("Getting List of Networks");
        String[] NetworkList = {"Avinash","Asharphi","Abhishek"};
        return NetworkList;
    }

    @Override
    public void ConnectToNetwork(String network) {
        System.out.println("Connecting to" + network);
    }
}
public class Polymorphism_Interfaces {
    public static void main(String[] args) {
        MyCamera1 cam1 = new MySmartPhone1(); // This is a Smartphone but use it as a camera.
        // cam1.GetNetworks(); --Not allowed
        cam1.Record4KVideos();
        cam1.TakeSnap();
        MySmartPhone1 ph = new MySmartPhone1();
        ph.ConnectToNetwork(" Airtel");
        ph.Record4KVideos();
        ph.RecordVideo();
        ph.PickCall();
        ph.CallNumber(65);
    }
}

