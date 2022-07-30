package lesson13Kaz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomException {
//        StringUtilsLesson utils = new StringUtilsLesson();
//        String s1 = "21";
//        String s2 = "0";
//        try {
//            utils.div(s1, s2);
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Введите нормальные числа");
//        }
//        System.out.println("конец");
//        }
        List<Integer> res = new ArrayList<>();
        StringUtilsLesson utils = new StringUtilsLesson();
        res = utils.findWord("в лесу родилась елочка в лесу она росла", "лесу");
        for (int i :res) {
            System.out.println(i);
        }

        List<Double> res1 = new ArrayList<>();
        res1 = utils.findNumbers("в лесу родилась елочка 3.7 в лесу она 5.6 росла");
        for (double i : res1) {
            System.out.println(i);
        }
    }
}

