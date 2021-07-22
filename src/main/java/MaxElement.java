import java.util.Scanner;

public class MaxElement {
    /**
     * @return метод возвращает введенную строку
     */
    public String[] getLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во слов в строке");
        int length = scanner.nextInt();
        String[] inputLine = new String[length];
        String tmpString;
        System.out.println("Введите строку");
        for (int i = 0; i < length; i++) {
            tmpString = scanner.next();
            inputLine[i] = tmpString;
        }
        return inputLine;
    }

    /**
     *
     * @return возвращает слово максимальной длины
     */
    public String getMaxElement() {
        String[] input = getLine();
        String result = null;
        int count = 0;
        for (String s : input) {
            if (s.length() > count) {
                count = s.length();
                result = s;
            }
        }
        return result;
    }
}
