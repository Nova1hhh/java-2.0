import task3.Calculator;
import task3.MaxElement;
import task4.holiday.Cake;
import task4.holiday.Candy;
import task4.holiday.JellyBeans;
import task4.holiday.Sweetness;
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
            Cake cake1 = new Cake("киевский", 2, 1500, "Большой");
            Cake cake2 = new Cake();
            cake2.setTitle("московский");
            cake2.setWeight(1.5);
            cake2.setPrice(1050.2);
            cake2.setSize("Средний");
            Candy candy1 = new Candy("Шипучки", 1.5, 120.5, "Roshen", 300);
            Candy candy2 = new Candy("Twix mini", 3.5, 3000, "Mars inc.", 600);
            JellyBeans jelly1 = new JellyBeans("Бон Пари", 2.3, 1000, "Червячки");

            Sweetness[] gift = {cake1, cake2, candy1, candy2, jelly1};

            System.out.println("Общая цена подарка = " + Sweetness.getTotalPrice(gift));
            System.out.println("Общий вес подарка = " + Sweetness.getTotalWeight(gift));

            for (Sweetness tmp : gift) {
                System.out.println(tmp.toString());
            }
        }
    }
}
