package task4.Holiday;

public class Candy {
    private double price;
    private double weight;
    private String taste;

    public Candy(double price, double weight, String taste) {
        this.price = price;
        this.weight = weight;
        this.taste = taste;
    }

    public Candy() {

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
}
