package task4.holiday;

public class JellyBeans extends Sweetness{
    private String type;

    public JellyBeans(String title, double weight, double price, String type) {
        super(title, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Мармеладки: " + super.toString() + ", тип = " + type + ";";
    }
}
