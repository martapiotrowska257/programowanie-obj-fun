import java.util.Arrays;

public class TotalValueDiscount implements Promotion {
    @Override
    public void apply(Product[] products) {
        double total = Arrays.stream(products).mapToDouble(Product::getDiscountPrice).sum();
        if (total > 300) {
            for (Product p : products) {
                p.setDiscountPrice(p.getDiscountPrice() * 0.95);
            }
        }
    }
}
