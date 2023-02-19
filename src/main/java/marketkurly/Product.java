package marketkurly;

public class Product {
    private long id;
    private String name;
    private long price;
    private PackageType packageType;
    private long stock;

    public Product(long id, String name, long price, PackageType packageType, long stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.packageType = packageType;
        this.stock = stock;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", packageType=" + packageType +
                ", stock=" + stock +
                '}';
    }
}
