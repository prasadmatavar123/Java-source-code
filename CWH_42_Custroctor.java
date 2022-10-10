class MyMainEmployee {
    private int id;
    private String name;

    // public MyMainEmployee(){
    //     id = 45;
    //     name = "Your name here";
    // }
    public MyMainEmployee(String myName){
        id = 45;
        name = myName;
    }
    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;

    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }

}
public class CWH_42_Custroctor {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee("CodeWithHarry");
        // harry.setName("CodeWithHarry");
        // harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
        
    }
    
}
