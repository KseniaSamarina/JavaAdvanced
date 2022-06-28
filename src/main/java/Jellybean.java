public class Jellybean extends Sweets {
    private String color;
    public Jellybean(String name, Double price, Double weight, String color) {
        super(name, price, weight);
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Jellybean [" + super.toString() + ", color = " + color + "]";
    }
}
