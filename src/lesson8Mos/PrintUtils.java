package lesson8Mos;

import java.util.Scanner;

public class PrintUtils {
    public static void printQuestion(Question question) {
        System.out.println(question.getQuestion());
        Option[] options = question.getOptions();
        for (int i = 0; i < options.length; i++) {
            if (options[i] != null) {
                System.out.println("  " + (i + 1) + " - " + options[i].getOption());
            }

        }
    }

    public static int[] getAnswers(int maxCountOptions){
        System.out.println("Выберите варианты: ");
        Scanner sc = new Scanner(System.in);
        String inputAnswer = sc.nextLine(); //"1 2 3"
        String[] nums = inputAnswer.split(" "); //["1", "2", "3"]
        int[]result = new int[nums.length]; //[0,0,0]

        for (int i = 0; i < nums.length; i++) {
            result[i] = Integer.parseInt(nums[i]);
        }
        return result;
    }
}
