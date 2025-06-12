import java.util.Arrays;

public class FreeMugDiscount implements Promotion {
    @Override
    public void apply(Product[] products) {
        double total = Arrays.stream(products).mapToDouble(Product::getDiscountPrice).sum();
        if (total > 200) {
            Product mug = new Product("MUG001", "Firmowy kubek", 0.00);
            mug.setDiscountPrice(0.00);
            Product[] newCart = Arrays.copyOf(products, products.length + 1);
            newCart[products.length] = mug;
            System.arraycopy(newCart, 0, products, 0, newCart.length); // simulate adding
        }
    }
}
