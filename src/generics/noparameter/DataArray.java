package generics.noparameter;

public class DataArray<T> {
    private T[] data = (T[]) new Object[10];
    int length=0;

    public void append(T data){
        this.data[length++]=data;
    }

    public static void main(String[] args){
        DataArray da = new DataArray();
        da.append("hello");
        da.append(new Integer(45));
        da.append(78);
    }
}
