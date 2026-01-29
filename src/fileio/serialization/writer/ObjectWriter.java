package fileio.serialization.writer;

import fileio.serialization.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriter {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("student3.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s = new Student();
        s.rollNo=10;
        s.name="Mrigraj";
        s.department="CSE";

        oos.writeObject(s);
    }
}
