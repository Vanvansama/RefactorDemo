package gildedRose;

/**
 * Create with IDEA
 *
 * @Author: gitee.com/KamisamaXX
 * @Date: Create in 23:12 2019/8/19
 * @Description:
 */
public class AgedBrie implements updateStrategy {

    public static final int MAX_QUALITY = 50;

    @Override
    public void update(Item item) {
        if (item.getQuality() < MAX_QUALITY) {
            item.setQuality(item.getQuality() + 1);
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            if (item.getQuality() < MAX_QUALITY) {
                item.setQuality(item.getQuality() + 1);
            }
        }
    }
}
