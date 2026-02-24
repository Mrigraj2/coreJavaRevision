package generics.inheritance;

class DataArray<T> {
    private T[] array = (T[]) new Object[10];
    int length=0;
    public void append(T value){
        array[length++]=value;
    }

}

public class DataArray2 extends DataArray<String>{
    private String[] strArray = new String[10];
    int length=0;

    public void addToString(String str){
        strArray[length++]=str;
    }

    public static void main(String[] args){
        DataArray2 da2 = new DataArray2();

        da2.append("Hi");
        da2.addToString("hey");
    }

}
