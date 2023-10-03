package seminar3.src.application;

public class CheckingPhoneNumber {
    public boolean check(String str) {
        if(str.length() != 11) {
            return true;
        }
        if (!str.matches("\\d+")) {
            return true;
        }
        return false;
    }
}
