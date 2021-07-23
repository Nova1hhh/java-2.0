import task3.Calculator;
import task3.MaxElement;
import task4.holiday.Gift;
import task4.swap.Swap;

import java.util.Scanner;

/**
 * @author Николай
 * @version 4.0
 */
class TaskController {
    public static void main(String[] args) {
        System.out.println("Выберите задание: 1 - калькулятор; 2 - поиск максимального слова в строке; " +
                " 3 - замена максимального и минимального элементов массива местами\n" +
                "4 - задание про подарок(4.2)");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        if (operation == 1) {
            Calculator calculator = new Calculator();
            calculator.result();
        } else if (operation == 2) {
            MaxElement maxElement = new MaxElement();
            System.out.printf("Самое длинное слово: %s", maxElement.getMaxElement());
        } else if (operation == 3) {
            Swap swap = new Swap();
            swap.swap();
        } else if (operation == 4) {
            Gift.getGiftInfo();
        }
    }
}
