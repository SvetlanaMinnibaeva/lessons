package lesson9Mos.zoo;

public class Tiger extends Animal {
    public void run(){
        System.out.println("Тигр бегает");
    }
    public void jump(){
        System.out.println("Тигр прыгает");
    }
    //  переопределение метода - когда в родительском классе есть метод который не нравится как работает
    //  то мы можем в дочернем классе сделать такойц же метод! только с другим телом
    public void voice(){
        System.out.println("РРРРРРРрррррр");
    }
}
