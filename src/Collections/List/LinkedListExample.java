package Collections.List;

import java.util.List;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
      //  List<Integer> list =new LinkedList<>();
         LinkedList<Integer> list =new LinkedList<>(); //if I implement here there are more methods to use.
        list.add(1); //Is equal to addLast() method. //this in only appear if I create the linkedList since a linkedList
                    //and no to a List.
        list.add(10);
        list.add(5);
        list.addLast(3);

        list.removeLast();
        list.removeFirst();

        System.out.println("isEmpty: " + list.isEmpty()); // = false
        for (Integer num: list) {
            System.out.println(num);
        }

    }
}
