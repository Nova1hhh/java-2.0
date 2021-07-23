package task4.holiday;

import java.util.Arrays;
import java.util.Scanner;

public class Gift {
    public static void getGiftInfo() {
        System.out.println("Введите кол-во мармеладок, пироженых и конфет в подарке:");
        int amount_beans, amount_cakes, amount_candies;
        Scanner scanner = new Scanner(System.in);
        amount_beans = scanner.nextInt();
        amount_cakes = scanner.nextInt();
        amount_candies = scanner.nextInt();
        Bean[] beans = new Bean[amount_beans];
        Cake[] cakes = new Cake[amount_cakes];
        Candy[] candies = new Candy[amount_candies];
        // конечно дальше идет копипаста, мб позже сделаю по-человечески
        for (int i = 0; i < amount_beans; i++) {
            System.out.printf("Введите информацию о %d мармеладке: цена, вес, вкус:\n", i + 1);
            double tmp1 = scanner.nextDouble();
            double tmp2 = scanner.nextDouble();
            String tmp3 = scanner.next();
            Bean tmp = new Bean(tmp1, tmp2, tmp3);
            beans[i] = tmp;
        }
        for (int i = 0; i < amount_cakes; i++) {
            System.out.printf("Введите информацию о %d пироженом: цена, вес, вкус:\n", i + 1);
            double tmp1 = scanner.nextDouble();
            double tmp2 = scanner.nextDouble();
            String tmp3 = scanner.next();
            Cake tmp = new Cake(tmp1, tmp2, tmp3);
            cakes[i] = tmp;
        }
        for (int i = 0; i < amount_candies; i++) {
            System.out.printf("Введите информацию о %d конфете: цена, вес, вкус:\n", i + 1);
            double tmp1 = scanner.nextDouble();
            double tmp2 = scanner.nextDouble();
            String tmp3 = scanner.next();
            Candy tmp = new Candy(tmp1, tmp2, tmp3);
            candies[i] = tmp;
        }
        double totalPrice = Bean.getBeanPrice(beans) + Candy.getCandyPrice(candies) + Cake.getCakePrice(cakes);
        double totalWeight = Bean.getBeanWeight(beans) + Candy.getCandyWeight(candies) + Cake.getCakeWeight(cakes);
        System.out.println("Вес подарка составляет " + totalWeight);
        System.out.println("Общая стоимость подарка составляет " + totalPrice);
        System.out.println("Вкусы конфет:");
        System.out.println(Arrays.toString(Candy.getCandyInfo(candies)));
        System.out.println("Вкусы мармеладок:");
        System.out.println(Arrays.toString(Bean.getBeanInfo(beans)));
        System.out.println("Вкусы пироженых:");
        System.out.println(Arrays.toString(Cake.getCakeInfo(cakes)));
    }
}
