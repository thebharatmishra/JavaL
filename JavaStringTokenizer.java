import java.util.StringTokenizer;

public class JavaStringTokenizer{
    public static void main(String[] args) {
        StringTokenizer s1= new StringTokenizer("Bharat Mishra Bhanu");
        while (s1.hasMoreTokens()) {
            System.out.println(s1.nextToken());
        }
    }
}