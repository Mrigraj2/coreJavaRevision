package fileio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedInputStream;
public class BufferRead {

    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("text2.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileReader fr = new FileReader("text.txt");
        BufferedReader br = new BufferedReader(fr);

        int x;
        while((x = bis.read())!=-1)
        {
            System.out.print((char) x);
        }
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println(br.readLine());
    }
}
