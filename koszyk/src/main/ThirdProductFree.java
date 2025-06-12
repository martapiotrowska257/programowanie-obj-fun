import java.util.Arrays;
import java.util.Comparator;

public class ThirdProductFree implements Promotion {
    @Override
    public void apply(Product[] products) {
        if (products.length >= 3) {
            Arrays.sort(products, Comparator.comparing(Product::getDiscountPrice));
            products[2].setDiscountPrice(0);
        }
    }
}
