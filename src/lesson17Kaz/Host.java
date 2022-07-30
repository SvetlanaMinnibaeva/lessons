package lesson17Kaz;

import org.apache.log4j.Logger;

public class Host {
    private static final Logger LOGGER = Logger.getLogger(Host.class);

    public static void main(String[] args) {

        Singer1 singer1 = new  Singer1();
        Singer2 singer2  = new  Singer2();
        Singer3  singer3 = new  Singer3();

        singer3.setDaemon(true);
        LOGGER.info("Концерт начинается");

        singer1.setName("Киркоров");
        singer1.start();

        singer2.setName("Пугачева");
        singer2.start();

        singer3.setName("Леонтьев");
        singer3.start();

        while ( singer1.isAlive()) {

        }
        LOGGER.info("Концерт закончился");
    }
}
