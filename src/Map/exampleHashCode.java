package Map;

import java.util.HashMap;
import java.util.Map;

public class exampleHashCode {
    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>();

        map.put("Adam", new Person("Adam Sandler", 25));
    }
}
