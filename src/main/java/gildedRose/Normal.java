package gildedRose;

/**
 * Create with IDEA
 *
 * @Author: gitee.com/KamisamaXX
 * @Date: Create in 23:11 2019/8/19
 * @Description:
 */
public class Normal implements updateStrategy {
    @Override
    public void update(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }
}
