public class Product {
    private String name;
    private String type;
    private String colour;
    private int price;


    public Product(String name, String type, String colour, int price) {
        this.name = name;
        this.type = type;
        this.colour = colour;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public String getType() {
        return type;
    }


    public String getColour() {
        return colour;
    }


    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Products{name=" + name + ", type=" + type + ", colour=" + colour + ", price=" + price + "}";
    }
}
