package calculator;

import java.util.Arrays;

class Arabic {
    public static String operations(String input){
        int[] x_y;
        input = input.replaceAll(" ", "");
        if (input.contains("-")) {
            x_y = Arrays.stream(input.split("-")).mapToInt(Integer::parseInt).toArray();
            return sub(x_y);
        }
        else if (input.contains("+")) {
            x_y = Arrays.stream(input.split("\\+")).mapToInt(Integer::parseInt).toArray();
            return sum(x_y);
        }
        else if (input.contains("/")) {
            x_y = Arrays.stream(input.split("/")).mapToInt(Integer::parseInt).toArray();
            return div(x_y);
        }
        else if (input.contains("*")) {
            x_y = Arrays.stream(input.split("\\*")).mapToInt(Integer::parseInt).toArray();
            return mult(x_y);
        }
        return "";
    }

    private static String sub(int[] x_y) {
        return String.valueOf(x_y[0] - x_y[1]);
    }

    private static String sum(int[] x_y) {
        return String.valueOf(x_y[0] + x_y[1]);
    }

    private static String mult(int[] x_y) {
        return String.valueOf(x_y[0] * x_y[1]);
    }

    private static String div(int[] x_y) {
        return String.valueOf(x_y[0] / x_y[1]);
    }
}
