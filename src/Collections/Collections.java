package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collections {
    public static void main(String[] args) {
        Product door = new Product("wonder door", 35);
        Product floorPanel = new Product("Floor panel", 25);
        Product window = new Product("Glass window",10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        //only with iterator interface we can delete an object in the arraylist collection.
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()){
            Product product = iterator.next();
            if(product.getWeight() > 20){
                iterator.remove();
            }

        }
        System.out.println(products);


        Collection<Product> toRemove = new ArrayList<>();
        toRemove.add(door);
        toRemove.add(floorPanel);
        products.removeAll(toRemove); //remueve toda la coleccion que se encuentra en toRemove en products
        System.out.println(products);
    }


}
