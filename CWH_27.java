public class CWH_27 {
    public static void main(String[] args) {
        // int[] marks = {98,55,43,78,10};
        // float[] marks = {98.1f,55.05f,43.8f,78.3f,10.34f};
        // System.out.println(marks.length);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // String[] student = {"Rohan","Rahul","Rohit","Lokesh"};
        // System.out.println(student.length);
        // System.out.println(student[1]);
        int[] marks = { 90, 60, 55, 45, 77 };
        // System.out.println(marks.length);
        // Displaying the Array (Naive way) 
        System.out.println("Printing using Naive method");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (for loop)
        System.out.println("Printing using for loop"); 
        for(int i=0;i<marks.length; i++){
            System.out.println(marks[i]);
        }

        //  quick quiz: Displaying the Array  in reverse order(for loop) 
        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }

        //Quick Quiz Displaying the Arry (for-each loop)
        System.out.println("Printing using for-each loop");
        for(int element: marks){
            System.out.println(element);
        }

    }

}
