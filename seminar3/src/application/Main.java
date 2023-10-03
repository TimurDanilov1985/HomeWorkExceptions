package seminar3.src.application;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Input input = new Input();
        Messages messages = new Messages();
        CheckingSpace checkingSpace = new CheckingSpace();
        CheckingDate checkingDate = new CheckingDate();
        CheckingPhoneNumber checkingPhoneNumber = new CheckingPhoneNumber();
        ProcessingData processingData = new ProcessingData(input, view, messages, checkingSpace, checkingDate, checkingPhoneNumber);
        view.setMessage(messages.getMESSAGE1());
        view.print();
        view.setMessage(messages.getMESSAGE2());
        view.print();
        String[] data = processingData.dataVerification();
        WritingToFile writingToFile = new WritingToFile(view);
        writingToFile.setData(data);
        writingToFile.writeFile();
    }
}
