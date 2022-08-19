package Collections.Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDeques {
    public static void main(String[] args) {

        //FIFO
   //     Queue<Integer> queue = new ArrayDeque<>();
        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(1); //firt item inserted is the first iem take out.
        queue.offer(10);
        queue.offer(100);
        queue.offer(1000);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
