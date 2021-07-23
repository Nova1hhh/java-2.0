package task4.holiday;

public class Bean {
    private double price;
    private double weight;
    private String taste;

    public Bean(double price, double weight, String taste) {
        this.price = price;
        this.weight = weight;
        this.taste = taste;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public static double getBeanWeight(Bean[] beans) {
        double result = 0;
        for (Bean bean : beans) {
            result += bean.getWeight();
        }
        return result;
    }

    public static double getBeanPrice(Bean[] beans) {
        double result = 0;
        for (Bean bean : beans) {
            result += bean.getPrice();
        }
        return result;
    }

    public static String[] getBeanInfo(Bean[] beans) {
        String[] result = new String[beans.length];
        for (int i = 0; i < beans.length; i++) {
            result[i] = beans[i].getTaste();
        }
        return result;
    }
}
