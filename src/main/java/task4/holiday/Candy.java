package task4.holiday;

public class Candy {
    private double price;
    private double weight;
    private String taste;

    public Candy(double price, double weight, String taste) {
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

    public static double getCandyWeight(Candy[] candies) {
        double result = 0;
        for (Candy candy : candies) {
            result += candy.getWeight();
        }
        return result;
    }

    public static double getCandyPrice(Candy[] candies) {
        double result = 0;
        for (Candy candy : candies) {
            result += candy.getPrice();
        }
        return result;
    }

    public static String[] getCandyInfo(Candy[] candies) {
        String[] result = new String[candies.length];
        for (int i = 0; i < candies.length; i++) {
            result[i] = candies[i].getTaste();
        }
        return result;
    }

}
