public class CWH_85_finally {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This is the end of this program");
        }
    }

}
