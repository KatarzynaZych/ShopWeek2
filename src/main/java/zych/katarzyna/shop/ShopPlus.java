package zych.katarzyna.shop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("plus")
public class ShopPlus implements BasketService {

    @Value("${shop.tax}")
    private int tax;

    @EventListener(ApplicationReadyEvent.class)
    public void getInfo() {
        displayBasket(getBasket(), tax, 0);
    }
}
