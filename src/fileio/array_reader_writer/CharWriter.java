package fileio.array_reader_writer;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharWriter {

    public static void main(String[] args)
    {
        char[] b = {'a','b','c','d','r','f','g','h','i','j'};
        try(CharArrayWriter caw =new CharArrayWriter())
        {
            caw.write('w');
            caw.write(b);

            char[] c = caw.toCharArray();

            for(char d:c){
                System.out.print(d);
            }

            caw.writeTo(new FileWriter("C:\\Users\\coolk\\desktop\\CoreJava\\text4.txt"));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
