package cn.xpbootcamp.gilded_rose;

public class Item {

    public final String productName;
    public final int sellIn;
    public int quality;

    public Item(String productName, int sellIn, int quality) {
        this.productName = productName;
        this.sellIn = sellIn;
        this.quality = quality;
    }
}
