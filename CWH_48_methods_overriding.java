class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am methods 2 of class A");
    }

}
class B extends A{
    public void meth3(){
        System.out.println("I am methods 3 of class A");
    }
}
public class CWH_48_methods_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        
    }
    
}
