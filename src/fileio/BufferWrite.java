package fileio;

import java.io.*;

public class BufferWrite {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("tew.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String x = "Hello world";

        bos.write(x.getBytes());

        bos.flush();
    }
}
