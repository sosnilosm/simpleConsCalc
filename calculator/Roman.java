package calculator;

import java.util.Arrays;

class Roman {
    static final String[] listOfRoman = {
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI",
            "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX",
            "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI",
            "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV",
            "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII",
            "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI",
            "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
    };

    public static String operations(String input) {
        String[] x_y;
        input = input.replaceAll(" ", "");
        if (input.contains("-")) {
            x_y = input.split("-");
            return sub(x_y);
        }
        else if (input.contains("+")) {
            x_y = input.split("\\+");
            return sum(x_y);
        }
        else if (input.contains("/")) {
            x_y = input.split("/");
            return div(x_y);
        }
        else if (input.contains("*")) {
            x_y = input.split("\\*");
            return mult(x_y);
        }
        return "";
    }

    private static int romanToArabic(String roman) {
        return (Arrays.asList(listOfRoman).indexOf(roman) + 1);
    }

    private static String arabicToRoman(int arabic) {
        try {
            return listOfRoman[arabic-1];
        }
        catch (Exception e) {
            throw new ArithmeticException("The calculator.Roman value is less 1");
        }
    }

    private static String sub(String[] x_y) {
        return arabicToRoman(romanToArabic(x_y[0]) - romanToArabic(x_y[1]));
    }

    private static String sum(String[] x_y) {
        return arabicToRoman(romanToArabic(x_y[0]) + romanToArabic(x_y[1]));
    }

    private static String mult(String[] x_y) {
        return arabicToRoman(romanToArabic(x_y[0]) * romanToArabic(x_y[1]));
    }

    private static String div(String[] x_y) {
        return arabicToRoman(romanToArabic(x_y[0]) / romanToArabic(x_y[1]));
    }
}
