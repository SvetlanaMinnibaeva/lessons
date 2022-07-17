package lesson8Kaz;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.orat();
        Cat cat = new Cat(1, "Британский");
        cat.orat();

        Animal slon1 = new Animal(12, "Африканский");
        Animal slon2 = new Animal(13, "Африканский");
        Animal slon3 = slon1;

        System.out.println(slon1.equals(slon2));

        System.out.println();

        System.out.println(cat.hashCode());

        System.out.println(slon1.toString());


    }

}
