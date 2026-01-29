package fileio.serialization;

import java.io.*;

public class PracticeQuizWriter {

    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("quiz.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        float[] f = {1.2f,2f,3.34f,5.6f,6.7f,7.8f};
        for(float x:f)
        {
            dos.writeFloat(x);
        }
    }
}
