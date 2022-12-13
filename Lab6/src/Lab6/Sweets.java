package Lab6;

public class Sweets {
    private String name;
    private double price;
    private double weight;
    private double size;
    private double chocolate_content;

    public Sweets(String name, double price, double weight, double size, double chocolate_content) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.size = size;
        this.chocolate_content = chocolate_content;
    }

    public double getPrice() {
        return price;
    }

    public double getChocolate_content() {
        return chocolate_content;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "name="+name +
                ", price=" + price +
                ", weight=" + weight +
                ", size=" + size +
                ", chocolate_content=" + chocolate_content +
                '}';
    }
}
