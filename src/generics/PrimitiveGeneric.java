package generics;

public class PrimitiveGeneric {

    public static void main(String[] args) {
        Object x = new String("Hello");
        Object y = new Integer(10);

//        System.out.println(y.toString() + x.toString());

        Object[] array = new String[3];

        array[0] = "Hello";
        array[1] = "hi";
        array[2] = "34";

        String[] str = (String[]) array;

//        for(int i =0; i<array.length;i++)
//        {
//            System.out.println(array[i]);
//        }

        for(String q: str)
        {
            System.out.println(q);
        }

    }
}
