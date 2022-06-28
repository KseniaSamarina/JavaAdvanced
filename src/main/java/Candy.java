public class Candy extends Sweets {
    private String topping;
    public Candy () {};
    public Candy(String name, Double price, Double weight, String topping) {
        super(name, price, weight);
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }
    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Candy [" + super.toString() + ", topping = " + topping + "]";
    }
}
