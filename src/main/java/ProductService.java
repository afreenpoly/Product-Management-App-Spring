import java.util.ArrayList;
import java.util.List;

public class ProductService{
    //initialize an array of products
    List<Product> prodlist=new ArrayList<>();
    ProductDB db=new ProductDB();

    //method to add products,which adds product to array
    public void addProduct(Product p) {
        // prodlist.add(p);
        db.save(p);
    }


    public List<Product> getAllProducts() {
        return prodlist;
    }

    //return type is product so must return something,maybe empty object
    public Product getProductByName(String name) {
        for (Product elem : prodlist) {
            if(elem.getName().equals(name)){
                return elem;
            }
        }
        return null;
    }

    public List<Product> getProductByColour(String color) {
        List<Product> colourprod=new ArrayList<>();
        for (Product elem : prodlist) {
            if (elem.getColour().equals(color))
            {
                 colourprod.add(elem);
            }
        }
        return colourprod;
    }


    public List<Product> getProductLessThan(int i) {
        List<Product> prod = new ArrayList<>();
        for (Product elem : prodlist) {
            if (elem.getPrice() <= i) { 
                prod.add(elem);
            }
        }
        return prod;
    }




    
    
}