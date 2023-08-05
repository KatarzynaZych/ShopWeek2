package zych.katarzyna.shop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("pro")
public class ShopPro implements BasketService {

    @Value("${shop.tax}")
    private int tax;

    @Value("${shop.discount}")
    private int discount;

    @EventListener(ApplicationReadyEvent.class)
    public void getInfo() {
        displayBasket(getBasket(), tax, discount);
    }
}
