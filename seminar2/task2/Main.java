package seminar2.task2;

public class Main {
    public static void main(String[] args) {
        //Задача 2. Исправить код
        //Исходный код
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }

        //Исправленый код
        int[] intArray = new int[9]; //Инициализируем массив с количеством элементов 9
        intArray[8] = 8; // Присваиваем 9 му элементу массива значение, так как с ним в коде проводится математическое действие
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d; //Код работает, исключение деления на 0 обрабатывается
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
