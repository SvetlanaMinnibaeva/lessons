package lesson4Kaz;

public class MainLogPass {
    public static void main(String[] args) {
        String login = "ivan@gmail.ru";
        String password = "Tkorwarr#d549";

        System.out.println(LoginPassword.symbolOccursOnce(login, "@"));
        System.out.println(LoginPassword.symbolOccursOnce(login, "."));
        System.out.println(LoginPassword.lastFirstSymbol(login));
        System.out.println(LoginPassword.equalLogPass(login, password));
        System.out.println(LoginPassword.minEightSymbols(password));
        System.out.println(LoginPassword.isOneCapitalLetter(password));
        System.out.println(LoginPassword.isOneSymbol(password));
        System.out.println(LoginPassword.allEngLetters(password));
        System.out.println(LoginPassword.notThreeSymbols(password));

    }
}
