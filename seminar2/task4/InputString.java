package seminar2.task4;

import java.util.Scanner;

public class InputString {
    private Scanner scanner;

    public InputString(Scanner scanner) {
        this.scanner = scanner;
    }

    public String input(String message) {
        System.out.print(message);
        String str = scanner.nextLine();
        return str;
    }
}
