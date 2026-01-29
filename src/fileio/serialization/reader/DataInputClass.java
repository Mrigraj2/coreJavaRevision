package fileio.serialization.reader;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputClass {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("student1.txt");
        DataInputStream dis = new DataInputStream(fis);

        System.out.println(dis.readInt());
        System.out.println(dis.readUTF());
        System.out.println(dis.readUTF());

    }

}
