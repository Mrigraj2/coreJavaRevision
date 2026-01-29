package fileio.serialization;

import java.io.*;

public class PracticeQuizReader {

    public static void main(String[] args) throws Exception
    {
        try{
            FileInputStream fis = new FileInputStream("quiz.txt");
            DataInputStream dis = new DataInputStream(fis);

//        System.out.print(dis.readFloat());
//            float x;
            while(true)
            {
                System.out.println(dis.readFloat());
            }
        }
        catch(EOFException e)
        {
            System.out.println("End of File reached");
        }
    }

}
