package lesson14Kaz;

public class Animal {
    protected String name;
    protected String breed;

    public Animal() {
    }

    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;

        if (name != null ? !name.equals(animal.name) : animal.name != null) return false;
        return breed != null ? breed.equals(animal.breed) : animal.breed == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        return result;
    }
}
