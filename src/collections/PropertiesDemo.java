package collections;

import java.util.Iterator;
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class PropertiesDemo {

    public static void main(String[] args){
        Properties pr = new Properties();
        Properties pr1 = new Properties();
        pr.setProperty("Name","Mrigraj");
        pr.setProperty("Stream","CSE");

        /**
         * Save file in text format
         */
        try{
            pr.store(new FileOutputStream("demo.txt"),"demo");
        }
        catch(IOException e){
            e.printStackTrace();
        }

        pr1.setProperty("Key","Values");
        pr1.setProperty("Name","Kishan");
        pr1.setProperty("Class","Xth");
        pr1.setProperty("Roll No","21");
        /**
         * Save file in XML format
         */
        try{
            pr1.storeToXML(new FileOutputStream("dem1.xml"),"XML");
        }catch(IOException e){

        }
        /**
         * Load from text file
         */
        try{
            pr.load(new FileInputStream("demo.txt"));

            pr.forEach((k,v)->System.out.println(k+" "+v));

        }catch(IOException e){

        }

        try{
            pr1.loadFromXML(new FileInputStream("dem1.xml"));
            System.out.println();
            pr1.forEach((k,v)->System.out.println(k+" "+v));
        }catch(IOException e){}
    }
}
