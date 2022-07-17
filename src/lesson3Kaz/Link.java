package lesson3Kaz;

public class Link {
    public static void main(String[] args) {
        String s = "123";
        int i = s.length();//количество символов
        System.out.println(i);
        char c = s.charAt(2);
        for (int j = 0; j < s.length(); j++) {
            if(s.charAt(j) == '2'){
                System.out.println("Двойка");
            } else {
                System.out.println(s.charAt(j));
            }
        }
    }
}
