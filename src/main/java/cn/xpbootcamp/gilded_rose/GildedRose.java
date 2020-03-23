package cn.xpbootcamp.gilded_rose;

public class GildedRose {

    private final Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for(Item item: items) {
            if ("Aged Brie".equals(item.name)) {
                item.quality = item.quality == 50 ? 50 : item.quality + 1;
            } else {
                item.quality = item.quality > 0 ? item.quality - 1 : 0;
            }
        }
    }
}
