package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    private strategyFactory factory = new strategyFactory();

    public void updateQuality() {
        for (Item item : items) {
            updateStrategy strategy = factory.getStrategy(item.getName());
            strategy.update(item);
        }
    }
}