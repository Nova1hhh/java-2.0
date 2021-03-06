import task3.Calculator;
import task3.MaxElement;
import task4.holiday.Cake;
import task4.holiday.Candy;
import task4.holiday.JellyBeans;
import task4.holiday.Sweetness;
import task4.swap.Swap;
import task5.CalculatorOOP;
import task6.Task6;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Николай
 * @version 6
 */
class TaskController {
    public static void main(String[] args) {
        System.out.println("Выберите задание: 1 - калькулятор; 2 - поиск максимального слова в строке; " +
                " 3 - замена максимального и минимального элементов массива местами\n" +
                "4 - задание про подарок(4.2); 5 - калькулятор ООП; 6 - чтение из файла");
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
//            CalculatorOOP calculator = new CalculatorOOP();
//            calculator.setVal1(-21);
//            calculator.setVal2(2);
//            calculator.setOp("*");
//            System.out.println(calculator);
//
////            CalculatorOOP cal1 = new CalculatorOOP(32.6 , -2, "/");
////            System.out.println(cal1);
//
//            CalculatorOOP cal2 = new CalculatorOOP(123, 20, "-");
//            double someResult = cal2.getResult();
//            System.out.println(someResult);
//
//            CalculatorOOP cal3 = new CalculatorOOP();
//            cal3.setVal1(2.2);
//            cal3.setVal2(3);
//            cal3.setOp("*");
//            System.out.println(cal3);
//
            CalculatorOOP cal4 = new CalculatorOOP();
            cal4.setVal1(100);
            cal4.setOp("+");
            try {
                System.out.println(cal4);
            } catch (Exception e) {
                System.err.println("Не заданы данные! val1 = " + cal4.getVal1() +
                        " val2 = " + cal4.getVal2() + " " + e);
            }
//            CalculatorOOP cal5 = new CalculatorOOP();
//            cal5.setVal1(111);
//            cal5.setVal2(2222);
//            //    Double someResult1 = cal5.getResult();
//            System.out.println(cal5);

            //    int asd = 21/0;
            //    System.out.println(asd);

            CalculatorOOP cal6 = new CalculatorOOP();

            System.out.println("Введите val1 operation val2:");
            double val1, val2;
            String op;

            try {
                val1 = scanner.nextDouble();
                op = scanner.next();
                val2 = scanner.nextDouble();
                cal6.setVal1(val1);
                cal6.setOp(op);
                cal6.setVal2(val2);
                System.out.println(cal6);
            } catch (InputMismatchException e) {
                System.err.println("Ошибка ввода! " + e);
            } catch (ArithmeticException e) {
                System.err.println("Деление на 0! " + e);
            }

        } else if (operation == 6) {
            Task6 task6 = new Task6();
            try {
                System.out.println("Введите путь к файлу (например C://123.txt): ");
                Scanner scanner1 = new Scanner(System.in);
                String path = scanner1.next();
                task6.readFromFile(path);
                Map<String, Integer> map = task6.getStat();
                System.out.println("Содержимое файла в остортированном виде: " + task6.getList());
                System.out.println("Статистика по количеству слов в файле: " + map);
                System.out.println("Наиболее часто повторяющиеся слова: " + task6.maxCount(map));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
    }
}
