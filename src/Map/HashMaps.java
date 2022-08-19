package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {

        //insert into the map 0(1) if there is not collisions.
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Adam");
        map.put(2, "Kevin");
        map.put(30, "Lucy");
        map.put(3, "Ana");
        map.put(null, "this is a null");

        //we cn retrieve items based on keys (0)
        System.out.println(map.get(1)); //return the value of the key 1
        System.out.println(map.get(70)); //return null
        System.out.println(map.get(null)); //return this is a null


         // to remove an item
        map.remove(3);

        System.out.println("=================================================");
        for(Integer key: map.keySet()){ //orderer asc// by key
            System.out.println(map.get(key));
        }
        System.out.println("=================================================");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
}
