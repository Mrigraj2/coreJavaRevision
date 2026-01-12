package fileio;

import java.io.FileOutputStream;

public class Write {

    public static void main(String[] args){
        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\coolk\\desktop\\CoreJava\\text.txt"))
        {
            String s = "This is a test file";
            fos.write(s.getBytes());
            System.out.println("Writing succesfull");
            fos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
