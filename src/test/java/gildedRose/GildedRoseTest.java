package gildedRose;

import org.junit.Assert;
import org.junit.Test;

/**
 * Create with IDEA
 *
 * @Author: Stefan Liu
 * @Date: Create in 18:35 2019/8/19
 * @Description:
 */
public class GildedRoseTest {
    @Test
    public void should_return_quality_given_name_stefan_sellin_0_quality_2() {
        Item[] items = {new Item("stefan", 0, 2)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 0);
        Assert.assertEquals(gildedRose.items[0].sellIn, -1);
    }

    @Test
    public void should_return_quality_given_name_stefan_sellin_1_quality_2() {
        Item[] items = {new Item("stefan", 1, 2)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 1);
        Assert.assertEquals(gildedRose.items[0].sellIn, 0);
    }

    @Test
    public void should_return_quality_given_name_stefan_sellin_0_quality_1() {
        Item[] items = {new Item("stefan", 0, 1)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 0);
        Assert.assertEquals(gildedRose.items[0].sellIn, -1);
    }

    @Test
    public void should_return_quality_given_name_stefan_sellin_1_quality_1() {
        Item[] items = {new Item("stefan", 1, 1)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 0);
        Assert.assertEquals(gildedRose.items[0].sellIn, 0);
    }

    @Test
    public void should_return_quality_given_name_stefan_sellin_0_quality_0() {
        Item[] items = {new Item("stefan", 0, 0)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 0);
        Assert.assertEquals(gildedRose.items[0].sellIn, -1);
    }

    @Test
    public void should_return_quality_given_name_stefan_sellin_1_quality_0() {
        Item[] items = {new Item("stefan", 1, 0)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 0);
        Assert.assertEquals(gildedRose.items[0].sellIn, 0);
    }

    @Test
    public void should_return_quality_given_name_SulfurasHandofRagnaros_sellin_0_quality_2() {
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros", 0, 2)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 2);
        Assert.assertEquals(gildedRose.items[0].sellIn, 0);
    }

    @Test
    public void should_return_quality_given_name_SulfurasHandofRagnaros_sellin__1_quality_2() {
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros", -1, 2)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 2);
        Assert.assertEquals(gildedRose.items[0].sellIn, -1);
    }

    @Test
    public void should_return_quality_given_name_SulfurasHandofRagnaros_sellin_0_quality_0() {
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros", 0, 0)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 0);
        Assert.assertEquals(gildedRose.items[0].sellIn, 0);
    }

    @Test
    public void should_return_quality_given_name_SulfurasHandofRagnaros_sellin__1_quality_0() {
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros", -1, 0)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 0);
        Assert.assertEquals(gildedRose.items[0].sellIn, -1);
    }

    @Test
    public void should_return_quality_given_name_AgedBrie_sellin_0_quality_50() {
        Item[] items = {new Item("Aged Brie", 0, 50)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 50);
        Assert.assertEquals(gildedRose.items[0].sellIn, -1);
    }

    @Test
    public void should_return_quality_given_name_AgedBrie_sellin_1_quality_50() {
        Item[] items = {new Item("Aged Brie", 1, 50)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 50);
        Assert.assertEquals(gildedRose.items[0].sellIn, 0);
    }

    @Test
    public void should_return_quality_given_name_AgedBrie_sellin_0_quality_49() {
        Item[] items = {new Item("Aged Brie", 0, 49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 50);
        Assert.assertEquals(gildedRose.items[0].sellIn, -1);
    }

    @Test
    public void should_return_quality_given_name_AgedBrie_sellin_1_quality_49() {
        Item[] items = {new Item("Aged Brie", 1, 49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 50);
        Assert.assertEquals(gildedRose.items[0].sellIn, 0);
    }

    @Test
    public void should_return_quality_given_name_AgedBrie_sellin_0_quality_48() {
        Item[] items = {new Item("Aged Brie", 0, 48)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 50);
        Assert.assertEquals(gildedRose.items[0].sellIn, -1);
    }

    @Test
    public void should_return_quality_given_name_AgedBrie_sellin_1_quality_48() {
        Item[] items = {new Item("Aged Brie", 1, 48)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        Assert.assertEquals(gildedRose.items[0].quality, 49);
        Assert.assertEquals(gildedRose.items[0].sellIn, 0);
    }

}
