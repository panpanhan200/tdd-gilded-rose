package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
    @Test
    void quality_is_never_smaller_than_0() {
        Item[] items = new Item[] {new Item("Product Item", 1, 1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(0, items[0].quality);
        gildedRose.updateQuality();
        assertEquals(0, items[0].quality);
    }

    @Test
    void quality_is_never_more_than_50() {
        Item[] items = new Item[] {new Item("Aged Brie", 1, 50)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(50, items[0].quality);
    }
}