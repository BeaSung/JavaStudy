package marketkurly;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private List<Product> values = new ArrayList<>();

    public void register(Product product) {
        values.add(product);
    }

    public void register(List<Product> products) {
        values.addAll(products);
    }

    public List<Product> search(String name) {
        List<Product> searchResult = new ArrayList<>();
        for (Product product : this.values) {
            if (product.getName().contains(name)) {
                searchResult.add(product);
            }
        }
        return searchResult;
    }

    @Override
    public String toString() {
        return "Products{" +
                "values=" + values +
                '}';
    }
}
