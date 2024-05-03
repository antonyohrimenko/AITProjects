package lesson22.classwork.example01;

public class OrderDetails {

    private Product product;
    private int amount;
    private double subtotal;

    public OrderDetails(Product product, int amount) {
        this.product = product;
        this.amount = amount;
        this.subtotal = product.getPrice() * amount;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setProduct(Product product) {
        this.product = product;
        this.subtotal = product.getPrice() * amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
        this.subtotal = product.getPrice() * amount;
    }
}
