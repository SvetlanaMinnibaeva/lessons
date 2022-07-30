package lesson17Kaz;

import org.apache.log4j.Logger;

public class  Singer1 extends Thread {
    private boolean needStop = false;

    @Override
    public void run() {

        int count = 0;
        while (!needStop) {
            count++;
            if (count > 2) needStop = true;
            for (int i = 0; i < 3; i++) {
                Logger.getLogger( Singer1.currentThread().getName()).info(" поет");
                System.out.println("------Lalala");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            Logger.getLogger( Singer1.currentThread().getName()).info(" передал микрофон");
            synchronized (Monitorings.MIKROFON) {
                Monitorings.MIKROFON.notify();
            }
            synchronized (Monitorings.MIKROFON) {
                try {
                    Monitorings.MIKROFON.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

