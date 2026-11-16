package by.itacademy.ninamaneha.javabasics.digitsvalidator;

public class OnlyDigitsCheck {
    public static void main(String[] args) {
        String str1 = "123456";
        String str2 = "123a45";
        String str3 = "-123456";

        System.out.println("Строка \"" + str1 + "\" содержит только цифры: " + hasOnlyDigits(str1));
        System.out.println("Строка \"" + str2 + "\" содержит только цифры: " + hasOnlyDigits(str2));
        System.out.println("Строка \"" + str3 + "\" содержит только цифры: " + hasOnlyDigits(str3));
    }

    public static boolean hasOnlyDigits(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
