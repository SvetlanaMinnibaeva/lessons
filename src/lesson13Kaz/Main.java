package lesson13Kaz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
        res = utils.findWord(",kf,kf,kf", ",kf");
        for (int i :res) {
            System.out.println(i);
        }
    }
}

