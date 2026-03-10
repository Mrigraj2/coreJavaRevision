package collections;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;

public class LinkedHashMapForCache {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry e){
                return  size()>5;
            }
        };

        lhm.put(1,"a");
        lhm.put(2,"b");
        lhm.put(3,"c");
        lhm.put(4,"d");
        lhm.put(5,"e");
        String d = lhm.get(3);

        lhm.put(6,"ty");

        lhm.forEach((x,y)->System.out.println(x + " " +y));

        Iterator<Integer> i = lhm.keySet().iterator();
        while(i.hasNext()){System.out.println(i.next());}
    }
}
