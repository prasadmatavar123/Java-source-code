public class CWH_33_Var_Args {
    // static int sum(int a,int b){
    //     return a+b;
    // }
    // static int sum(int a, int b, int c){
    //     return a+b+c;
    // }
    // static int sum(int a,int b,int c,int d){
    //     return a+b+c+d;
    // }
    static int sum(int ...arr){
        // Available as int[] arr; 
        int result = 0;
        for(int a: arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(" welcome to Varargs tutorials");
        System.out.println("The sum of 4 and 5 is:"  + sum(4,5));
        System.out.println("The sum of 5,7 and 10 is: "  + sum(5,7,10));
        System.out.println("The sum of 10,20,30 and 40 is:" +sum(10,20,30,40));
    }
    
}
