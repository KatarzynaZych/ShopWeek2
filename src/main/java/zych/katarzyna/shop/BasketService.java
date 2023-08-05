package zych.katarzyna.shop;

import java.util.ArrayList;
import java.util.List;

public interface BasketService {

    default ArrayList<Product> getBasket() {
        var products = new ArrayList<Product>();
        for (int i = 1; i < 6; i++) {
            products.add(Product.randomProduct());
        }
        return products;
    }

    default void displayBasket(List<Product> products, int tax, int discount) {
        var prices = products
                .stream()
                .map(Product::getPrice)
                .map(price -> price + price * tax/100 - price * discount/100)
                .reduce(0, Integer::sum);

        products.forEach(product -> System.out.println(product.getName()));
        System.out.println("To pay: " + prices);
    }
}
