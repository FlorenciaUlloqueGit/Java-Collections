package Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder()); //reverse the order of the nodes
        treeMap.put(10, "ten"); // if I create a map with String, String , so the sorting will be depends of the alphabetic order of the key.
        treeMap.put(3, "three");
        treeMap.put(5, "five");
        treeMap.put(1, "one");
        treeMap.put(8, "eight");

      //  System.out.println("smallest key = "+ treeMap.lastKey());
       // System.out.println(treeMap.firstKey);
        for(Map.Entry<Integer, String> entry: treeMap.entrySet()){ //show the nodes in order asc by the key
            System.out.println(entry.getKey()+" " + entry.getValue());
        }


    }
}
