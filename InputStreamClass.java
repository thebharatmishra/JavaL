import java.io.*;;
public class InputStreamClass {
    public static void main(String[] args){
        FileInputStream infile= null;

        try{
            infile= new FileInputStream("a1.txt");
        int b;
        while ((b = infile.read())!=-1) {
            System.out.println((char)b);
        }
        infile.close();
        }

    }
}
