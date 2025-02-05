import java.util.*;

class Main {
    public static void main(String[] args) {
        String s = "Neeraj123@!";
        int upper = 0;
        int lower = 0;
        int symbol = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (!Character.isDigit(ch)) {
                symbol++;
            }
        }

        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Symbols: " + symbol);
    }
}
