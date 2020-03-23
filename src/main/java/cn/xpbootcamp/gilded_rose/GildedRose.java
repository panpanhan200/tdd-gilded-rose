package cn.xpbootcamp.gilded_rose;

public class GildedRose {

    private final Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for(Item item: items) {
            item.quality = item.quality > 0 ? item.quality - 1 : 0;
        }
    }
}
