package lessons.java.basics.lesson1;

import java.util.Scanner;

public class Exercise6bis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        if (b % 2 != 0) {
            System.out.println("Нечётное");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Чётное");
        }

    }
}
