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
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            if (item.getQuality() > 0) {
                item.setQuality(item.getQuality() - 1);
            }
        }
    }
}
