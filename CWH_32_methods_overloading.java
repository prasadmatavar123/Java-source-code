public class CWH_32_methods_overloading{
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + "bro");
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int[] arr){
        arr[0] = 98;
    }
    static void telljokes(){
        System.out.println("I invented a new more\n" + "Plagiarism!");

    }
    public static void main(String[] args){
        // telljokes(); 
        // int[] marks = {52,73,77,89,98,94};
        // // Case 1: Changing the integer
        //  int[] marks = {52,73,77,89,98,94};

        // change2(marks);
        // System.out.println("The value of x after running change is:" + marks[0]);

        // Methods overloading 
        foo();
        foo(3000);

    }
}
    
