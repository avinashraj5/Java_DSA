interface MyCamera{
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
interface MyWiFi{
    String[] GetNetworks();
    void ConnectToNetwork(String network);
}
class MyCellPhone{
    void CallNumber(int PhoneNumber){
        System.out.println("Calling"+ PhoneNumber);
    }
    void PickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWiFi, MyCamera{
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
public class default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] arr = ms.GetNetworks();
        for (String item: arr) {
            System.out.println(item);
        }
        ms.Record4KVideos();
        ms.RecordVideo();
        ms.TakeSnap();
    }
}
