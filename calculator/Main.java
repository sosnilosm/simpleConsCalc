package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(calc(new Scanner(System.in).nextLine()));
    }

    public static String calc(String input) {
        /*
        Determining with a regular expression whether a string contains Roman or Arabic numbers and is correct in structure
        */
        if (input.matches("((I{1,3}|IV|VI{0,3}|IX|X)\\s*[-+/*]\\s*(I{1,3}|IV|VI{0,3}|IX|X))")) {
            return Roman.operations(input);
        }
        else if (input.matches("((([1-9])|(10))\\s*[-+/*]\\s*(([1-9])|(10)))")){
            return Arabic.operations(input);

        }
        throw new ArithmeticException("The string of math operation is set incorrectly");
    }
}