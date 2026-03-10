package collections;

import java.util.*;

public class NormalLhm {

    public static void main(String[] args){
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5);
        lhm.put(1,"a");
        lhm.put(2,"b");
        lhm.put(3,"c");
        lhm.put(4,"d");
        lhm.put(5,"e");
        lhm.put(6,"f");

        System.out.println(lhm);
    }
}
