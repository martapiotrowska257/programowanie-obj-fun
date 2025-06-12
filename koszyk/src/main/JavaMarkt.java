import java.util.*;

public class JavaMarkt {
    private Product[] cart;
    private final List<Promotion> promotions;
    private Comparator<Product> currentSortOrder;

    public JavaMarkt() {
        cart = new Product[0];
        promotions = new ArrayList<>();
        currentSortOrder = Comparator.comparing(Product::getDiscountPrice).reversed()
                .thenComparing(Product::getName);
    }

    public void addToCart(Product product) {
        cart = Arrays.copyOf(cart, cart.length + 1);
        cart[cart.length - 1] = product;
    }

    public void removeFromCart(Product product) {
        cart = Arrays.stream(cart)
                .filter(p -> !p.equals(product))
                .toArray(Product[]::new);
    }

    public void sortCart() {
        Arrays.sort(cart, currentSortOrder);
    }

    public void setSortOrder(Comparator<Product> comparator) {
        currentSortOrder = comparator;
    }

    public Product findCheapest() {
        return Arrays.stream(cart)
                .min(Comparator.comparing(Product::getDiscountPrice))
                .orElse(null);
    }

    public Product findMostExpensive() {
        return Arrays.stream(cart)
                .max(Comparator.comparing(Product::getDiscountPrice))
                .orElse(null);
    }

    public Product[] findNCheapest(int n) {
        return Arrays.stream(cart)
                .sorted(Comparator.comparing(Product::getDiscountPrice).reversed())
                .limit(n)
                .toArray(Product[]::new);
    }

    public Product[] findNMostExpensive(int n) {
        return Arrays.stream(cart)
                .sorted(Comparator.comparing(Product::getDiscountPrice))
                .limit(n)
                .toArray(Product[]::new);
    }

    public double getTotalPrice() {
        return Arrays.stream(cart)
                .mapToDouble(Product::getDiscountPrice)
                .sum();
    }

    public void applyPromotions() {
        for (Promotion promo : promotions) {
            promo.apply(cart);
        }
    }

    public Product[] getCart() {
        return Arrays.copyOf(cart, cart.length);
    }
}
