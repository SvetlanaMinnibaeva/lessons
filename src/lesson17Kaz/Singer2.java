package lesson17Kaz;

import org.apache.log4j.Logger;

public class  Singer2 extends Thread {
    private boolean needStop = false;

    @Override
    public void run() {
        int count = 0;
        while (!needStop) {
            synchronized (Monitorings.MIKROFON) {
                try {
                    Monitorings.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
            if (count > 2) needStop = true;
            for (int i = 0; i < 3; i++) {
                Logger.getLogger( Singer2.currentThread().getName()).info(" поет");
                System.out.println("Falalaa------");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Logger.getLogger( Singer2.currentThread().getName()).info(" передала микрофон");
            synchronized (Monitorings.MIKROFON) {
                Monitorings.MIKROFON.notify();
            }

        }
    }
}

