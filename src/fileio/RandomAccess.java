package fileio;

import java.io.FileInputStream;
import java.io.RandomAccessFile;

public class RandomAccess {

    public static void main(String[] args) throws Exception
    {
        RandomAccessFile raf = new RandomAccessFile("text.txt","rw");

        System.out.println(raf.readLine());
        raf.seek(raf.length());
        String x = "Say hello to Riya";
        System.out.println(raf.getFilePointer());
        raf.writeChars(x);
        raf.writeChars("\n");
        raf.writeUTF("Hello wrold");
        raf.write(x.getBytes());
        System.out.println(raf.readLine());
        System.out.println(raf.readLine());

    }
}
