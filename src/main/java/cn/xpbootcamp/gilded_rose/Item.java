package cn.xpbootcamp.gilded_rose;

public class Item {

    public final String name;
    public final int sellIn;
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }
}
