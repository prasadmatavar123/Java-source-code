public class CWH_82_nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        try {
            System.out.println("welcome to video no. 82");
            try {
                System.out.println(marks[9]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry this index does not exit");

            }

        } catch (Exception e) {
            System.out.println("Exception in level 1");

        }
    }

}
