package lesson16Kaz;

import org.apache.log4j.Logger;
public class Main {
private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.trace("Наша ошибка info");
        LOGGER.info("Наша ошибка info");
        LOGGER.warn("Наша ошибка info");
    }

}
