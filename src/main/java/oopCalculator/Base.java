package oopCalculator;

import oopCalculator.operations.GetDivision;
import oopCalculator.operations.GetMultiplication;
import oopCalculator.operations.GetSubstraction;
import oopCalculator.operations.GetSum;

import java.util.Scanner;

public class Base {

    public static void getResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1е число");
        double val1 = scanner.nextDouble();
        System.out.println("Введите 2е число");
        double val2 = scanner.nextDouble();
        System.out.println("Введите действие");
        String op = scanner.next();
        if (val2 == 0 && op.equals("/")) {
            System.out.println("К сожалению, этот калькулятор не умеет делить на 0 =(\nПопобобуйте еще раз");
            getResult();
        } else {
            switch (op) {
                case "+" : {
                    GetSum sum = new GetSum();
                    System.out.println("Сумма = " + sum.getResult(val1, val2));
                    break;
                }
                case "/" : {
                    GetDivision division = new GetDivision();
                    System.out.println("Частное = " + division.getResult(val1, val2));
                    break;
                }
                case "-" : {
                    GetSubstraction substraction = new GetSubstraction();
                    System.out.println("Разность = " + substraction.getResult(val1, val2));
                    break;
                }
                case "*" : {
                    GetMultiplication multiplication = new GetMultiplication();
                    System.out.println("Произведение = " + multiplication.getResult(val1, val2));
                }
            }
        }
    }
}
