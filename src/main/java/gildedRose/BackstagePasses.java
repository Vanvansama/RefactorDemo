package gildedRose;

/**
 * Create with IDEA
 *
 * @Author: gitee.com/KamisamaXX
 * @Date: Create in 23:13 2019/8/19
 * @Description:
 */
public class BackstagePasses implements updateStrategy {
    @Override
    public void update(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
            if (item.sellIn < 11) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
            if (item.sellIn < 6) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
