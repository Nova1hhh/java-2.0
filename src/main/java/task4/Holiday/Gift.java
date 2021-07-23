package task4.Holiday;

public class Gift {
    public int total;
    Candy can1 = new Candy();
    Candy can2 = new Candy();
    public void getTotal() {
        can1.setPrice(132.32);
        can2.setPrice(-32);
        System.out.println(can1.getPrice() + can2.getPrice());
    }
}
