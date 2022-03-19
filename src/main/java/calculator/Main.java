package calculator;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static String[] line;

    public static void main(String[] args) {
        read();
    }

    private static int result(String[] array) {
        int result = Integer.parseInt(array[0]);
        int tmp = 0;
        for (int i = 1; i < array.length; i++) {
            if (i % 2 == 0) {
                tmp = Integer.parseInt(array[i]);
                String sign = action(array[i - 1]);
                switch (sign) {
                    case "+": result += tmp;
                        break;
                    case "-": result -= tmp;
                        break;
                }

            }
        }
        return result;
    }

    private static String action(String str) {
        String plus = "\\++";
        String minus = "\\-+";

        if (str.matches(plus)) {
            return "+";
        } else {
            return str.length() % 2 == 0 ? "+" : "-";
        }
    }

    private static void read() {
        while (true) {
            line = scanner.nextLine().split(" ");
            if (line[0].equals("")) {
                continue;
            } else if (line[0].equals("/help")) {
                System.out.println("The program calculates the sum of numbers");
                continue;
            } else if (line[0].equals("/exit")) {
                System.out.println("Bye!");
                break;
            } else if (line.length == 1) {
                System.out.println(Integer.parseInt(line[0]));
            } else {
                System.out.println(result(line));
            }
        }
    }
}
