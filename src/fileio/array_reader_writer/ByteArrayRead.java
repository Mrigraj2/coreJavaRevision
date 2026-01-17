package fileio.array_reader_writer;

import java.io.ByteArrayInputStream;

public class ByteArrayRead {
    public static void main(String[] args){
        byte[] b = {'a','b','c','d','r','f','g','h','i','j'};
        try(ByteArrayInputStream bis = new ByteArrayInputStream(b))
        {
            int x;
            while((x=bis.read())!=-1)
            {
                System.out.print((char)x);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
