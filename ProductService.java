import java.util.ArrayList;
import java.util.List;

public class ProductService{
    //initialize an array of products
    List<Product> prodlist=new ArrayList<>();

    //method to add products,which adds product to array
    public void addProduct(Product p) {
        prodlist.add(p);
    }


    public List<Product> getAllProducts() {
        return prodlist;
    }

    //return type is product so must return something,maybe empty object
    public Product getProduct(String name) {
        for (Product elem : prodlist) {
            if(elem.getName().equals(name)){
                return elem;
            }
        }
        return null;
    }
}