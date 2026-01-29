package fileio.serialization.reader;

import fileio.serialization.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("student3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s;
        s=(Student) ois.readObject();
        System.out.println(s.toString());
    }
}
