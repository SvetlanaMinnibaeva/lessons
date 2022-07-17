package lesson3Kaz;

public class HomeworkString4 {
    public static void main(String[] args) {
        //1) посчитать количество букв без пробела
        String str = "Так как в самом начале StringBuffer инициализируется строкой \"Java\", то его емкость " +
                "составляет 4 + 16 = 20 символов. Затем мы увеличиваем емкость буфера с помощью вызова strBuffer ";
        System.out.println(str.replaceAll("\\s+", "").length());

        //2) посчитать количество английских букв
        System.out.println(str.replaceAll("[^a-zA-Z]", "").length());

        //3) все цифры заменить на звездочку (*)
        System.out.println(str.replaceAll("\\d", "*"));

        //4) после каждой точки или запятой перeходить на новую строчку
        System.out.println(str.replaceAll("\\.", ".\n").replaceAll(",", ",\n"));

        //5)вывести все с заглавной буквы
        String[] str2 = str.split("\\s");
        StringBuilder newString = new StringBuilder();
        for (String s : str2) {
            newString.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
        }
        System.out.println(newString);

        //6)(***) вывести каждое второе слово
        String[] str3 = str.replaceAll("[^a-zA-Zа-яА-Я\\s]", "").split(" ");
        for (int i = 1; i < str3.length; i += 2) {
            System.out.print(str3[i] + " ");
        }
    }
}
