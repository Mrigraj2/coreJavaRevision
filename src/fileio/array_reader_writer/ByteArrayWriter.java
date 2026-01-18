package fileio.array_reader_writer;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayWriter {

    public static void main(String[] args)
    {
        try(ByteArrayOutputStream bos = new ByteArrayOutputStream())
        {
            byte[] b = {'a','b','c','d','r','f','g','h','i','j'};
            bos.write(b);
            bos.writeTo(new FileOutputStream("text3.txt"));
            byte[] c = bos.toByteArray();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
