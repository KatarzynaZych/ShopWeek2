package zych.katarzyna.shop;

import lombok.Getter;

import java.util.Random;

@Getter
public enum Product {

    DELL_VOSTRO("DELL VOSTRO 5620", 100),
    HP_ZBOOK("HP ZBook Studio", 280),
    LENOVO_IDEAPAD("Lenovo IdeaPad Duet", 200),
    MSI_GF66("MSI GF66", 250),
    MACBOOK_AIR("MACBOOK AIR", 300),
    ASUS("ASUS ExpertBook", 150),
    HP_CHROMEBOOK("HP Chromebook 11", 240);

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    private final String name;
    private final int price;
    private static final Random PRNG = new Random();

    public static Product randomProduct() {
        Product[] directions = values();
        return directions[PRNG.nextInt(directions.length)];
    }
}
