import java.util.ArrayList;
import java.util.List;

public class ListProductsDao {
    private List<Product> products;
    public ListProductsDao() {
        products = new ArrayList<>();
        products.add(new Product(1, "Widget A", "first product", 50));
        products.add(new Product(2, "Widget B", "second product", 60));
        products.add(new Product(3, "Widget C", "third product", 70));
    }


    // psvm to test methods
    public static void main( String[] args ) {

    }
}
