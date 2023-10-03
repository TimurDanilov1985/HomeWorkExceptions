package seminar3.src.application;

import java.util.Scanner;

public class Input {
    public String dataEntry() {
        Scanner scanner = new Scanner(System.in, "ibm866");
        String str = scanner.nextLine();
        return str;
    }
}
