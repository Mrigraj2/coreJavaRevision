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

            StringBuilder paragraph = new StringBuilder();

            while(true){
                String s = sc.nextLine();
                if(s.isEmpty()){
                    break;
                }
                paragraph.append(s).append("\n");
            }

            String y = new String(paragraph);

            System.out.println(y);
            fw.write(y.getBytes());
        }
        catch(IOException e){
            System.out.println(e);
        }


        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\coolk\\desktop\\CoreJava\\text2.txt"))
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\coolk\\desktop\\CoreJava\\text.txt");
            int x = fis.available();

            StringBuilder sb = new StringBuilder();
            int ch;
            while((ch =fis.read())!=-1){
                fos.write(ch);
//                System.out.println(sb);
            }

        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
