package fileio.array_reader_writer;

import java.io.CharArrayReader;

public class CharReader {
    public static void main(String[] args) throws Exception
    {
        char[] b = {'a','b','c','d','r','f','g','h','i','j'};
        CharArrayReader car = new CharArrayReader(b);
        int x;
        while((x=car.read())!=-1){
            System.out.println((char)x);
        }
    }
}
