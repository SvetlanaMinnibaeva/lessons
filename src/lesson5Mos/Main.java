package lesson5Mos;

public class Main {
    public static void main(String[] args) {
        String text = "Отпусти ты, старче, меня в море!";
        System.out.println(Methods.getVowelsCount(text));
        Methods.printReverseText(text);
        Methods.printPunctuationSignCount(text);
        Methods.printSquare(5,5);
        System.out.println(Methods.getMinOfThreeNumbers(5,4,3));
        System.out.println(Methods.getProcentSum(100000, 10.5,2));
        System.out.println(Methods.checkEmail("ivan@mail.ru"));
    }
}
