import java.io.*;
public class OutputStreamClass {
    public static void main(String[] args){
        FileOutputStream ofile = null;
        byte b1[]= {'A','B'};
        try{
            ofile= new FileOutputStream("a2.txt");
            ofile.write(b1);
            ofile.close();
        }
        catch () {

        }
    }
}
