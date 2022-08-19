package Map;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //HashCode = hash function


    //because in a hashMap it may happen
    //RULES:
    //if two objects are equals -> we have the same hash code.
    //if two objects have the same hash code not ever will be equals.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
    }

    // identificador de 32 bits que se almacena en un Hash en la instancia de la clase. Toda clase debe
    // proveer de un método hashCode() que permite recuperar el Hash Code asignado, por defecto,
    // por la clase Object
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
