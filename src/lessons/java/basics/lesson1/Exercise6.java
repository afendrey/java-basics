package lessons.java.basics.lesson1;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        }
        if (b % 2 == 0 && b <= 100) {
            System.out.println("Чётное");
        }
        if (b % 2 != 0) {
            System.out.println("Нечётное");
        }

    }
}
