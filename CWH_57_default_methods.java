// import javax.sound.sampled.SourceDataLine;

interface Camera{
    void takeSnap();
    void recordVideo();
}

interface Wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }
    // void takeSnap()
    // {
    //     System.out.println("Taking Snap");
    // }

}
public class CWH_57_default_methods {
    public static void main(String[] args) {
        
    }
    
}
