// import java.util.jar.Attributes.Name;

class MYThr extends Thread{
    public MYThr(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("I am a thraed");
        }
    }
}
public class CWH_73_Thread_Constructor {
    public static void main(String[] args) {
        MYThr t = new MYThr("Harry");
        t.start();
    }
    
}
