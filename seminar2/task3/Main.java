package seminar2.task3;

public class Main {
    //Задача 3. Исправить код

    //Исходный код
//    public static void main(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = { 1, 2 };
//            abc[3] = 9;
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }
//    }
//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//    }

    //Исправленый код
    public static void main(String[] args) {// throws Exception { не нужно выбрасывать в сигнатуре метода, так как есть блоки try catch
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) { // Исключения устанавливаем перед Throwable, так как это его наследник, конкретизирующий событие
            System.out.println("Массив выходит за пределы своего размера!");
//        } catch (NullPointerException ex) {                               в этом коде нет данного исключения
//            System.out.println("Указатель не может указывать на null!");
        } catch (Throwable ex) {
           System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) { //throws FileNotFoundException { данный код не работает с файлом
        System.out.println(a + b);
    }
}
