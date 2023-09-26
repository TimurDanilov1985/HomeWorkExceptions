package seminar2.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Задача 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static float input() {
        System.out.println("Здравствуйте\n");
        float number;
        for (; ; ) {
            System.out.print("Введите дробное число: ");
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextFloat();
                scanner.close();
                System.out.println("Благодарю за правильный ввод данных\n\nДосвидания");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введены не корректные данные! Введите пожалуйста числовое значение");
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(input());
    }
}
