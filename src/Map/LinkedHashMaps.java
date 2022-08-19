package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
    public static void main(String[] args) {

        //linkedHashMap need more memory than hashMap and standard hashtable.
        //Use linkedHashMap if it is necessary and we have to preserve the item's order.
        Map<String, Integer> map = new HashMap<>();

        map.put("aaa", 1);
        map.put("bbb", 2);
        map.put("ccc", 3);
        map.put("ddd", 4);
        map.put("eee", 5);
        map.put("fff", 6);
        map.put("ggg", 7);
        map.put("hhh", 8);
        map.put("iii", 9);
        map.put("jjj", 10);
        for(String key: map.keySet()){ //the hashMap's items not follow a order of insertion, but the LinkedHashMap yes.
            System.out.println(key + " "+ map.get(key));
        }

        System.out.println("---------------------------------------------------------");
        Map<String, Integer> mapLink = new LinkedHashMap<>();

        mapLink.put("aaa", 1);
        mapLink.put("bbb", 2);
        mapLink.put("ccc", 3);
        mapLink.put("ddd", 4);
        mapLink.put("eee", 5);
        mapLink.put("fff", 6);
        mapLink.put("ggg", 7);
        mapLink.put("hhh", 8);
        mapLink.put("iii", 9);
        mapLink.put("jjj", 10);
        for(String key: mapLink.keySet()){ //the LinkedHashMap respect the insertion order.
            System.out.println(key + " "+ mapLink.get(key));
        }

    }
}
