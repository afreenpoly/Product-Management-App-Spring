import java.util.List;

public class Main{
    public static void main(String[] args) {
        
        ProductService service = new ProductService();
        service.addProduct(new Product("HP350", "Mouse", "black", 150));
        service.addProduct(new Product("HP", "Laptop", "black", 50000));
        service.addProduct(new Product("Realme", "Phone", "blue", 25000));

        System.out.println("List of Products");
        List<Product> prod= service.getAllProducts();
        for(Product p :prod){
            System.out.println(p);
        }
        System.out.println(" ");



        System.out.println("Get one product by name");
        System.out.println(service.getProduct("Realme"));


    }
}