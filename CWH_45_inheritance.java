class Base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived{
    int x;
    int y;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am a setting x");
        this.x = x;

    }
    public void printMe(){
        System.out.println("I am a custroctor");
    }
}

public class CWH_45_inheritance {
    public static void main(String[] args) {
        
    }
    
}
