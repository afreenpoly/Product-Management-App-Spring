import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    Connection conn = null;
    private static final String URL = "jdbc:postgresql://localhost:5432/ProductDB";
    private static final String USER = "postgres";
    private static final String PASSWORD = "0000";

    public ProductDB() {

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void save(Product p) {

        String query = "insert into products (name,type,color,price) values (?,?,?,?) ";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, p.getName());
            st.setString(2, p.getType());
            st.setString(3, p.getColour());
            st.setInt(4, p.getPrice());
            st.execute();

        } catch (SQLException ex) {
        }

    }

    public List<Product> getAll() {
        List<Product> products =new ArrayList<>();
        String query = "select name,type,color,price from products";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                // Use the parameterized constructor
                Product p = new Product(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)
                );
                products.add(p);
            }
        } catch (SQLException ex) {
        }
        return products;
    }

}
