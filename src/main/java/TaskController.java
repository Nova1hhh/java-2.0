import task3.Calculator;
import task3.MaxElement;
import task4.holiday.Cake;
import task4.holiday.Candy;
import task4.holiday.JellyBeans;
import task4.holiday.Sweetness;
import task4.swap.Swap;
import task5.CalculatorOOP;


import java.util.Scanner;

/**
 * @author Николай
 * @version 4.0
 */
class TaskController {
    public static void main(String[] args) {
        System.out.println("Выберите задание: 1 - калькулятор; 2 - поиск максимального слова в строке; " +
                " 3 - замена максимального и минимального элементов массива местами\n" +
                "4 - задание про подарок(4.2); 5 - калькулятор ООП");
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
        } else if (operation == 5) {
            CalculatorOOP calculator = new CalculatorOOP();
            calculator.setVal1(21.3);
            calculator.setVal2(2);
            calculator.setOp("*");
            System.out.println(calculator);

            CalculatorOOP cal1 = new CalculatorOOP(32, -2, "/");
            System.out.println(cal1);

            CalculatorOOP cal2 = new CalculatorOOP(123, 20, "+");
            double someResult = cal2.getResult();
            System.out.println(someResult);

            CalculatorOOP cal3 = new CalculatorOOP();
            cal3.setVal1(2);
            cal3.setVal2(3);
            cal3.setOp("*");
            System.out.println(cal3);

            CalculatorOOP cal4 = new CalculatorOOP();
            cal4.setVal1(1);
            cal4.setOp("+");
            System.out.println(cal4);

            CalculatorOOP cal5 = new CalculatorOOP();
            cal5.setVal1(1);
            cal5.setVal2(2);
            Double someResult1 = cal5.getResult();
            System.out.println(cal5);
        }
    }
}
