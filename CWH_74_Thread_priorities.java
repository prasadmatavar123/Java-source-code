class MyThr2 extends Thread{
    public MyThr2(String name){
        super(name);
    }
    public void run(){
        // int i = 34; 
        System.out.println("Thank you " + this.getName());
        while(true){
            System.out.println("I am a thread");
        }
    }
}
public class CWH_74_Thread_priorities {
    public static void main(String[] args) {
        MyThr2 t1 = new MyThr2("Harry1");
        MyThr2 t2 = new MyThr2("Harry2");
        MyThr2 t3 = new MyThr2("Harry3");
        MyThr2 t4 = new MyThr2("Harry4");
        MyThr2 t5 = new MyThr2("Harry5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        
    }
    
}
