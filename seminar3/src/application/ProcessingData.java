package seminar3.src.application;

public class ProcessingData {
    private Input input;
    private View view;
    private Messages messages;
    private CheckingSpace checkingSpace;
    private CheckingDate checkingDate;
    private CheckingPhoneNumber checkingPhoneNumber;

    public ProcessingData(Input input, View view, Messages messages, CheckingSpace checkingSpace, CheckingDate checkingDate, CheckingPhoneNumber checkingPhoneNumber) {
        this.input = input;
        this.view = view;
        this.messages = messages;
        this.checkingSpace = checkingSpace;
        this.checkingDate = checkingDate;
        this.checkingPhoneNumber = checkingPhoneNumber;
    }

    public String[] dataVerification() {
        String[] array;
        for (; ; ) {
            String data = (input.dataEntry()).trim();
            array = data.split(" ");
            if (array.length != 6) try {
                throw new QuantityDataException();
            } catch (QuantityDataException e) {
                if (array.length < 6) {
                    view.setMessage(messages.getMESSAGE3());
                    view.print();
                } else if (array.length > 6) {
                    view.setMessage(messages.getMESSAGE4());
                    view.print();
                }
                view.setMessage(messages.getMESSAGE5());
                view.print();
            }
            else {
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            switch (i) {
                case (0):
                    for (; ; ) {
                        if (!array[i].matches("\\D+") | array[i].isEmpty() | checkingSpace.check(array[i])) try {
                            throw new NotCorrectFormatException();
                        } catch (NotCorrectFormatException e) {
                            view.setMessage(messages.getMESSAGE6());
                            view.print();
                            array[i] = input.dataEntry().trim();
                        }
                        else {
                            break;
                        }
                    }
                    break;
                case (1):
                    for (; ; ) {
                        if (!array[i].matches("\\D+") | array[i].isEmpty() | checkingSpace.check(array[i])) try {
                            throw new NotCorrectFormatException();
                        } catch (NotCorrectFormatException e) {
                            view.setMessage(messages.getMESSAGE7());
                            view.print();
                            array[i] = input.dataEntry().trim();
                        }
                        else {
                            break;
                        }
                    }
                    break;
                case (2):
                    for (; ; ) {
                        if (!array[i].matches("\\D+") | array[i].isEmpty() | checkingSpace.check(array[i])) try {
                            throw new NotCorrectFormatException();
                        } catch (NotCorrectFormatException e) {
                            view.setMessage(messages.getMESSAGE8());
                            view.print();
                            array[i] = input.dataEntry().trim();
                        }
                        else {
                            break;
                        }
                    }
                    break;
                case (3):
                    for (; ; ) {
                        if (checkingDate.check(array[i])) try {
                            throw new NotCorrectFormatException();
                        } catch (NotCorrectFormatException e) {
                            view.setMessage(messages.getMESSAGE9());
                            view.print();
                            array[i] = input.dataEntry().trim();
                        }
                        else {
                            break;
                        }
                    }
                    break;
                case (4):
                    for (; ; ) {
                        if (checkingPhoneNumber.check(array[i])) try {
                            throw new NotCorrectFormatException();
                        } catch (NotCorrectFormatException e) {
                            view.setMessage(messages.getMESSAGE11());
                            view.print();
                            array[i] = input.dataEntry();
                        }
                        else {
                            break;
                        }
                    }
                    break;
                case (5):
                    for (; ; ) {
                        if (!(array[i].equals("m") | array[i].equals("f")))try {
                            throw new NotCorrectFormatException();
                        } catch (NotCorrectFormatException e) {
                            view.setMessage(messages.getMESSAGE10());
                            view.print();
                            array[i] = input.dataEntry().trim();
                        }
                        else {
                            break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        view.setMessage(messages.getMESSAGE12());
        view.print();
        return array;
    }
}
