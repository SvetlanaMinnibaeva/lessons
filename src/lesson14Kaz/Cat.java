package lesson14Kaz;

public class Cat extends Animal {
    public Cat(String name, String breed) {
        super(name, breed);
    }

    public void voice(){
        System.out.println("Мяу");
    }
}
