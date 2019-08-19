package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals("Aged Brie")) {
                updateStrategy strategy = new AgedBrie();
                strategy.update(items[i]);
            } else if (items[i].getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                updateStrategy strategy = new BackstagePasses();
                strategy.update(items[i]);
            } else if (items[i].getName().equals("Sulfuras, Hand of Ragnaros")) {
                updateStrategy strategy = new Sulfuras();
                strategy.update(items[i]);
            } else {
                updateStrategy strategy = new Normal();
                strategy.update(items[i]);
            }
        }
    }
}