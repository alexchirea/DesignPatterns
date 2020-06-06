package creationalPatterns.builder;

public class Pie {

    private String fruits;
    private Float price;
    private Size size;

    public Pie() {
    }

    public Pie(String fruits, Float price, Size size) {
        this.fruits = fruits;
        this.price = price;
        this.size = size;
    }

    public String getFruits() {
        return fruits;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pie{" +
                "fruits='" + fruits + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
