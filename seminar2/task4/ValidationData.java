package seminar2.task4;

public class ValidationData {
    private InputString inputString;
    private OutputString outputString;

    public ValidationData(InputString inputString, OutputString outputString) {
        this.inputString = inputString;
        this.outputString = outputString;
    }

    public void validation() {
        outputString.output("Здравствуйте\n");
        String str = inputString.input("Введите строку: ");
        while (str.isEmpty()) {
            outputString.output("Вы вели пустую строку, пустую строку вводмить нельзя");
            str = inputString.input("Введите строку еще раз: ");
        }
        outputString.output(String.format("Вы ввели %s, благодарю за правильный ввод данных\n\nДосвидания", str));
    }
}
