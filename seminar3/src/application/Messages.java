package seminar3.src.application;

public class Messages {
    private final String MESSAGE1 = "Здравствуйте\n";
    private final String MESSAGE2 = "Введите фамилию, имя, отчество, дату рождения в формате дд.мм.гггг, " +
            "номер телефона и Ваш пол в формате м или ж\n" +
            "Все данные должны быть введены через пробел\nНапример: Иванов Иван Иванович 30.09.1985 89111553536 m\n" +
            "Введите данные: ";
    private final String MESSAGE3 = "Количество данных не соответствует регламенту. Вы ввели меньшее количество данных " +
            ".Введите пожалуйста данные в соответствии с примером выше\n";
    private final String MESSAGE4 = "Количество данных не соответствует регламенту. Вы ввели ,большее количество данных " +
            ".Введите пожалуйста данные в соответствии с примером выше\n";
    private final String MESSAGE5 = "Введите корректные данные: ";
    private final String MESSAGE6 = "В Фамилии не может быть чисел\nФамилия не может быть пустой строкой\n" +
            "Фамилия не должна содержать пробелов и небуквенных символов\nВведите Фамилию снова: ";
    private final String MESSAGE7 = "В Имени не может быть чисел\nИмени не может быть пустой строкой\n" +
            "Имя не должнао содержать пробелов и небуквенных символов\nВведите Имя снова: ";
    private final String MESSAGE8 = "В Отчестве не может быть чисел\nОтчество не может быть пустой строкой\n" +
            "Отчество не должно содержать пробелов и небуквенных символов\nВведите Отчество снова: ";
    private final String MESSAGE9 = "Формат даты рождения не корректен. Дата должна соответствовать формату ДД.ММ.ГГГГ\n" +
            "Проверьте правильность написания. Возможно числа дня, месяца или года выходят за пределы исчислений\n" +
            "Или введены несоответствующие обозначению символы. Пример правильных данных 18.12.1878\n" +
            "Введите дату рождения снова: ";
    private final String MESSAGE10 = "Формат Вашего пола не корректен. Пол должен соответствовать формату m или f\n" +
            "Введите Ваш пол снова: ";
    private final String MESSAGE11 = "Формат номера телефона не корректен. Номер телефона должен состоять из одиннадцати цифр, " +
            "например: 88009889898\nНомер телефона состоит только из цифр\nВведите номер телефона снова: ";
    private final String MESSAGE12 = "Благодарим за ввод\n";

    public String getMESSAGE1() {
        return MESSAGE1;
    }

    public String getMESSAGE2() {
        return MESSAGE2;
    }

    public String getMESSAGE3() {
        return MESSAGE3;
    }
    public String getMESSAGE4() {
        return MESSAGE4;
    }

    public String getMESSAGE5() {
        return MESSAGE5;
    }

    public String getMESSAGE6() {
        return MESSAGE6;
    }

    public String getMESSAGE7() {
        return MESSAGE7;
    }

    public String getMESSAGE8() {
        return MESSAGE8;
    }

    public String getMESSAGE9() {
        return MESSAGE9;
    }

    public String getMESSAGE10() {
        return MESSAGE10;
    }

    public String getMESSAGE11() {
        return MESSAGE11;
    }

    public String getMESSAGE12() {
        return MESSAGE12;
    }
}
