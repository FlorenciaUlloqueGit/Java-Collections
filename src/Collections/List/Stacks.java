package Collections.List;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
       // names.add("Adam"); method of list collection.
        names.push("Adam");
        names.push("Joe");
        names.push("Ana");
        names.push("Daniel");
        names.push("Katy");

    //    System.out.println(names);
      //  System.out.println(names.pop()); //remove the last item (katy) el ultimo en entrar es el primero en salir (LIFO)

        while (!names.isEmpty()){
            System.out.println(names.pop()); //remueve el primero en entrar primero (primero remueve katy que es la ultima y de asi para arriba
        }
    }
}
