package seminar3.src.application;

public class CheckingDate {
    public boolean check(String str) {
        String[] array = new String[10];
        if (str.length() != 10) {
            return true;
        }
        int i = 0;
        for (char c : str.toCharArray()) {
            array[i] = Character.toString(c);
            i++;
        }
        String[] array1 = new String[5];
        array1[0] = array[0] + array[1];
        array1[1] = array[2];
        array1[2] = array[3] + array[4];
        array1[3] = array[5];
        array1[4] = array[6] + array[7] + array[8] + array[9];
        int day;
        int month;
        int year;
        try {
            day = Integer.parseInt(array1[0]);
            month = Integer.parseInt(array1[2]);
            year = Integer.parseInt(array1[4]);
        } catch (NumberFormatException e) {
            return true;
        }
        if (!array1[1].equals(".") | !array1[3].equals(".")) {
            return true;
        }
        if (month == 2) {
            if (day > 29 | day < 0) {
                return true;
            }
        }
        if (day > 31 | month > 12 | year > 2023 | year < 1900) {
            return true;
        }
        return false;
    }
}
