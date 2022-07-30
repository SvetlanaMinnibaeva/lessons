package lesson17Kaz;

import org.apache.log4j.Logger;

public class  Singer3 extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Monitorings.MIKROFON) {
                try {
                    Monitorings.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 3; i++) {
                Logger.getLogger( Singer3.currentThread().getName()).info(" поет");

                System.out.println("Na----na-----na");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Logger.getLogger( Singer3.currentThread().getName()).info(" передал микрофон");
            synchronized (Monitorings.MIKROFON) {
                Monitorings.MIKROFON.notify();
            }
        }
    }
}
