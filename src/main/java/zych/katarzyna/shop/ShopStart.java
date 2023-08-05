package zych.katarzyna.shop;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("start")
public class ShopStart implements BasketService {

    @EventListener(ApplicationReadyEvent.class)
    public void getInfo() {
        displayBasket(getBasket(), 0, 0);
    }
}
