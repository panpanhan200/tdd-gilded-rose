package cn.xpbootcamp.gilded_rose;

public class Item {

    public final ItemName name;
    public final int sellIn;
    public int quality;

    public Item(ItemName name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }
}
