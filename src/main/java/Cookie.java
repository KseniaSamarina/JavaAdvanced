public class Cookie extends Sweets {
    private String shape;
    public Cookie(String name, Double price, Double weight, String shape) {
        super(name, price, weight);
        this.shape = shape;
    }
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Cookie [" + super.toString() + ", shape = " + shape + "]";
    }
}
