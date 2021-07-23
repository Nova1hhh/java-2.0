package task4.holiday;

public class Cake {
    private double price;
    private double weight;
    private String taste;

    public Cake(double price, double weight, String taste) {
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

    public static double getCakeWeight(Cake[] cakes) {
        double result = 0;
        for (Cake cake : cakes) {
            result += cake.getWeight();
        }
        return result;
    }

    public static double getCakePrice(Cake[] cakes) {
        double result = 0;
        for (Cake cake : cakes) {
            result += cake.getPrice();
        }
        return result;
    }

    public static String[] getCakeInfo(Cake[] cakes) {
        String[] result = new String[cakes.length];
        for (int i = 0; i < cakes.length; i++) {
            result[i] = cakes[i].getTaste();
        }
        return result;
    }
}
