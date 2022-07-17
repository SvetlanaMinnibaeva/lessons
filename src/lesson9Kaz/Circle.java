package lesson9Kaz;

public class Circle implements Figure, Figure3d {
    @Override
    public void printVolume() {
        System.out.println("Volume");
    }

    @Override
    public void printPerimeter() {
        System.out.println("per");
    }

    @Override
    public void print3d() {

    }
}
