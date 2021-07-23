import task3.Calculator;
import task3.MaxElement;
import task4.Holiday.Gift;
import task4.swap.Swap;

import java.util.Scanner;

/**
 * @author Николай
 * @version 1.1
 */
class Base {
    public static void main(String[] args) {
        System.out.println("Выберите задание: 1 - калькулятор; 2 - поиск максимального слова в строке; " +
                " 3 - замена максимального и минимального элементов массива местами");
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
            Gift gift = new Gift();
            gift.getTotal();
        }
    }
}
