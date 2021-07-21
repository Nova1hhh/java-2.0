import java.util.Scanner;

/**
 * @author Николай
 */

public class Calculator {
    public static void main(String[] args) {
        double val1, val2, result;
        Scanner scanner = new Scanner(System.in);
        // Считаем числа с консоли
        System.out.println("Введите 1е число");
        val1 = scanner.nextDouble();
        System.out.println("Введите 2е число");
        val2 = scanner.nextDouble();
        // Выбор операции
        String operation;
        System.out.println("Выберите операцию: +, -, /, *");
        operation = scanner.next();
        switch (operation) {
            case "+" -> System.out.printf("Сумма равна %.4f", addition(val1, val2));
            case "-" -> System.out.printf("Разность равна %.4f", subtraction(val1, val2));
            case "*" -> System.out.printf("Произведение равно %.4f", multiplication(val1, val2));
            case "/" -> System.out.printf("Деление равно %.4f", division(val1, val2));
        }
    }

    /**
     * @param val1 левый операнд
     * @param val2 правый операнд
     * @return возвращает сумму введенных значений
     * @see <a href=url>https://ru.wikipedia.org/wiki/%D0%A1%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B5</a>
     */
    public static double addition(double val1, double val2) {
        return val1 + val2;
    }
    public static double subtraction(double val1, double val2) {
        return val1 - val2;
    }
    public static double multiplication(double val1, double val2) {
        return val1 * val2;
    }
    public static double division (double val1, double val2) {
        return val1 / val2;
    }

}
