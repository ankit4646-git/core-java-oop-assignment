public class AjProduct {
    private int productId;
    private String productName;
    private double price;

    // Default constructor using constructor chaining for cleaner initialization
    public AjProduct() {
        this(0, "Unknown", 0.0);
    }

    // Parametrized constructor to assign specific product values
    public AjProduct(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Accessor method to retrieve current product cost
    public double getPrice() {
        return this.price;
    }

    // Accessor method to retrieve product identifier name
    public String getProductName() {
        return productName;
    }

    // Mutator method with conditional check for price validation
    public void setPrice(double price) {
        // Only update field if the provided value is positive
        this.price = (price > 0) ? price : this.price;
    }
}