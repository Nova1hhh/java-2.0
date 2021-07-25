package task4.holiday;

public abstract class Sweetness {
    private String title;
    private double weight;
    private double price;

    public Sweetness(String title, double weight, double price) {
        this.title = title;
        this.weight = weight;
        this.price = price;
    }

    public Sweetness() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static double getTotalPrice(Sweetness[] box) {
        double price = 0;
        for (Sweetness someSweet : box) {
            price += someSweet.getPrice();
        }
        return price;
    }

    public static double getTotalWeight(Sweetness[] box) {
        double weight = 0;
        for (Sweetness someSweet : box) {
            weight += someSweet.getWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "название = " + title +
                ", вес = " + weight +
                ", цена = " + price;
    }
}
