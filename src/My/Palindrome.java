package My;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("uонilоu"));
    }


    public static boolean isPalindrome(String text) {
        String str1 = text.replaceAll("[^a-zA-Z0-9]", "");
        String str2 = new StringBuffer(str1).reverse().toString();
        return str1.equalsIgnoreCase(str2);
    }
}
