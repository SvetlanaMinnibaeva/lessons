package lesson4Kaz;

public class LoginPassword {
    // 1.1) и 1.2) проверить одна собачка и точка в логине или нет
    public static boolean symbolOccursOnce(String login, String symbolForRegex) {
        return login.replaceAll("[^" + symbolForRegex + "]", "").length() == 1;
    }

    // 1.3) точка не должна быть в начале/конце слова, собачки, не должно быть две собачки подряд
    public static boolean lastFirstSymbol(String login){
        return login.charAt(0) != '.' && login.charAt(login.length() - 1) != '.' &&
                !login.contains(".@") && !login.contains("@.")  && !login.contains("@@");
    }

    //  2.1) пароль не должен соответствовать почте
    public static boolean equalLogPass(String login, String password) {
        return !login.equals(password);
    }

    // 2.2) минимум 8 символов
    public static boolean minEightSymbols(String password) {
        return password.length() >= 8;
    }

    // 2.3) одна заглавная буква
    public static boolean isOneCapitalLetter(String password) {
        return password.replaceAll("[^A-ZА-Я]", "").length() == 1;
    }

    // 2.4) проверить один ли символ
    public static boolean isOneSymbol(String password) {
        return password.replaceAll("[A-Za-zА-Яа-я\\d]", "").length() == 1;
    }

    // 2.5) проверить все ли буквы английские
    public static boolean allEngLetters(String password) {
        password = password.replaceAll("[^A-Za-zА-Яа-я]", "");
        char[] arr = password.toCharArray();
        boolean allEng = true;
        for (int el : arr) {
            if (!('a' <= el && el <= 'z') && !('A' <= el && el <= 'Z')) {
                allEng = false;
                break;
            }
        }
        return allEng;
    }

    // ***2.6) не должно быть три символа подряд
    public static boolean notThreeSymbols(String password) {
        char[] arr = password.toCharArray();
        boolean notThreeSymbols = true;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
                notThreeSymbols = false;
                break;
            }
        }
        return notThreeSymbols;
    }
}
