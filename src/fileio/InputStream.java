package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {

    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("C:\\Users\\coolk\\desktop\\CoreJava\\text.txt")){
            byte s = 0;
//            System.out.println((char)s);
            byte[] b = new byte[78];
            int i =0;
            do{
                s = (byte) fis.read();
                b[i] = s;
                i++;
            }
            while(fis.read()!=-1);

            for(byte x:b){
                System.out.print((char)x);
            }


        }catch(IOException e){
            System.out.println(e);
        }
    }

}
