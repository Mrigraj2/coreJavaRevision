package fileio.serialization.writer;

import fileio.serialization.Student;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamClass {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("student2.txt");
        PrintStream ps = new PrintStream(fos);

        Student s = new Student();
        s.rollNo=10;
        s.name="Mrigraj";
        s.department="CSE";

        ps.println(s.rollNo);
        ps.println(s.name);
        ps.println(s.department);
    }
}
