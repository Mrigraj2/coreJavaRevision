package fileio.serialization.writer;

import fileio.serialization.Student;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputClass {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("student1.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            Student s = new Student();
            s.rollNo=10;
            s.name="Mrigraj";
            s.department="CSE";

            dos.writeInt(s.rollNo);
            dos.writeUTF(s.name);
            dos.writeUTF(s.department);
            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
