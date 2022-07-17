package lesson9Mos;

public class Otlichnik extends Student {

    @Override
    public void printPerimeterTriangle(int a, int b, int c) {
        if(a > b + c || b > a + c || c > a + b){
            System.out.println("Это не треугольник!!");
        } else {
            System.out.println(a+b+c);
        }
    }
}
