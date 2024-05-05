public class JavaUserDefinedException {
    public static void main(String[] args) {
        try {
            throw new JavaException("Bharat Mishra");
        } catch (JavaException e) {
            System.out.println(e);
        }
    }
}
