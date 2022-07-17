package lesson9Mos.zoo;

public class Zoo {
    public static void main(String[] args) {
        Tiger tiger1  = new Tiger();
        Tiger tiger2  = new Tiger();

        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();

        Animal[] animals = new Animal[4];
        animals[0] = tiger1;
        animals[1] = tiger2;
        animals[2] = monkey1;
        animals[3] = monkey2;

        for (Animal animal: animals) {
            animal.voice();// полиморфизм это свойство джава работать с разными типами как с одним и тем же!!
            // но в то же самое время выполнение программы будет разное, как будто вы работаете с разными типами
        }

    }
}
