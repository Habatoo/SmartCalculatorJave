package calculator;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static String[] line;

    public static void main(String[] args) {
        read();
    }

    private static int sum(String[] array) {
        int sum = 0;
        for (String str : array) {
            sum += Integer.parseInt(str);
        }
        return sum;
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
                System.out.println(sum(line));
            }
        }
    }
}
