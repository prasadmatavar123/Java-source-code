class Employee1{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is: " + id);
        System.out.println("and my name is: " + name);
    }
    public int getsalary(){
        return salary;
    }
}
public class CWH_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 harry = new Employee1(); //Instantiating a new Employee1 object
        Employee1 john = new Employee1(); //
        //setting properties
        harry.id = 12;
        harry.name = "CodeWithHarry";
        harry.salary = 12000;
        john.id = 17;
        john.name = "john Tripathi";
        john.salary = 150;
        // Printing the Atributes 
        harry.printDetails();
        john.printDetails();
        int salary = john.getsalary();
        // System.out.println(harry.id);
        // System.out.println(harry.name);
        System.out.println(salary);
    }
    
}
