package lesson13Kaz;

import java.util.ArrayList;
import java.util.List;

public class StringUtilsLesson implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException {
        double res;
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }

        double n1 = Double.parseDouble(number1);
        double n2 = Double.parseDouble(number2);

        if (n2 == 0d) {
            throw new ArithmeticException("number2 = 0");
        }
        res = n1 / n2;
        return res;
    }

    @Override
    public List<Integer> findWord(String text, String word) throws NullPointerException {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int contains = 0;
        while (contains != -1) {
            contains = text.indexOf(word, i);
            if (contains > 0)
                result.add(i);
            contains = 0;
            i++;
        }
        return result;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
