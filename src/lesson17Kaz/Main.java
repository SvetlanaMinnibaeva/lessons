package lesson17Kaz;

public class Main {
    public static void main(String[] args) {
       // MyThread myThread = new MyThread();
       // myThread.start();
        Thread myThread = new Thread(new MyThread());
        myThread.start();

        for(int i = 0; i < 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
