package seminar2.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputString inputString = new InputString(scanner);
        OutputString outputString = new OutputString();
        ValidationData validationData = new ValidationData(inputString, outputString);
        validationData.validation();
        scanner.close();
    }
}
