package Collections.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>(); //LinkedList extiende de deque y a su vez esta de queue.

        //FIFO structure (First in, first out)
        queue.offer("adam"); //is the same that add, the crucial difference is that return a boolean value that
                                //alert if the insert was been successfull or not.
        queue.add("keniv");
        queue.add("ana");
        queue.add("katy");

//        System.out.println("remove item: "+ queue.remove()); //remove the first item we have inserted

        for (String s :queue         ) {
            System.out.println(s);
        }

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }

    }
}
