class EkClass{
    int a;
    public int getA(){
        return a;
    }
    EkClass(int v){
        a = v;
    }
    public int returnone(){
        return 1;
    }
}
public class CWH_47_this_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        System.out.println(e.getA());
        
    }
    
}
