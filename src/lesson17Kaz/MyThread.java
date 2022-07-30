package lesson17Kaz;

public class MyThread implements Runnable{
    @Override
    public void run(){
    for (int i = 100; i < 110; i++) {
        System.out.println(i);
    }
    try {
        Thread.sleep(300);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
}
