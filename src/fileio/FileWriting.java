package fileio;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileOutputStream;

public class FileWriting {

    public static void main(String[] args){


        try(FileOutputStream fw = new FileOutputStream("C:\\Users\\coolk\\desktop\\CoreJava\\text.txt"))
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your keywords to write in file");
            String s = sc.nextLine();
            StringBuilder paragraph = new StringBuilder();

            System.out.println(s);
            fw.write(s.getBytes());
        }
        catch(IOException e){
            System.out.println(e);
        }


        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\coolk\\desktop\\CoreJava\\text2.txt"))
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\coolk\\desktop\\CoreJava\\text.txt");
            int x = fis.available();

            StringBuilder sb = new StringBuilder();

            while(fis.read()!=-1){
                sb.append(fis.read());
                System.out.println(sb);
            }
            String s = new String(sb);
//            System.out.println(s.getBytes());
//            fos.write((char)s.getBytes());

        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
