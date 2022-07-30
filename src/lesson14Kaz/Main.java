package lesson14Kaz;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Person, List<Animal>> map = new HashMap<>();
        Person person1 = new Person("Вася", 36);
        Person person2 = new Person("Петя", 24);
        Animal cat = new Cat("Рыжик", "Британский");
        Animal dog = new Dog();
        dog.name = "Бобик";
        Animal cat2 = new Cat("Мурзик", "Мей-кун");

        List<Animal> listAnimal1 = new ArrayList<>();
        List<Animal> listAnimal2 = new ArrayList<>();
        listAnimal1.add(cat);
        listAnimal1.add(dog);
        listAnimal2.add(cat2);

        map.put(person1, listAnimal1);
        map.put(person2, listAnimal2);

        System.out.println(map);

    }
}
