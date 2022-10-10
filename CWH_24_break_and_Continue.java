public class CWH_24_break_and_Continue {
    public static void main(String[] args) {
        // Break and Continue using loops
        // for(int i=0; i<5; i++){
        // System.out.println(i);
        // System.out.println("Java is great");
        // if(i==2){
        // System.out.println("Ending the loop");
        // break;
        // }
        // }
        // int i = 0;
        // while (i < 5) {
        // System.out.println(i);
        // System.out.println("Java is great");
        // if (i == 2) {
        // System.out.println("Ending the loop");
        // break;

        // }
        // i++;
        // }
        // System.out.println("Loop end here");
        for (int i = 0; i < 50; i++) {
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;

            }
        }
    }

}
