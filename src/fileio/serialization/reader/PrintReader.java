package fileio.serialization.reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class PrintReader {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("student2.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
    }
}
