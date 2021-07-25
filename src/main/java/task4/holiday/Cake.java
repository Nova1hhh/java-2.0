package task4.holiday;

public class Cake extends Sweetness{

    private String size;

    public Cake(String title, double weight, double price, String size) {
        super(title, weight, price);
        this.size = size;
    }

    public Cake() {

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Тортик: " + super.toString() + ", размер = " + size + ";";
    }
}
