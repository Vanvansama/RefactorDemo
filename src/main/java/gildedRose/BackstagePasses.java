package gildedRose;

/**
 * Create with IDEA
 *
 * @Author: gitee.com/KamisamaXX
 * @Date: Create in 23:13 2019/8/19
 * @Description:
 */
public class BackstagePasses implements updateStrategy {

    public static final int MAX_QUALITY = 50;
    public static final int MAX_SELL_IN = 11;
    public static final int MIDDLE_QUALITY = 6;

    @Override
    public void update(Item item) {
        if (item.getQuality() < MAX_QUALITY) {
            item.setQuality(item.getQuality() + 1);
            if (item.getSellIn() < MAX_SELL_IN) {
                if (item.getQuality() < MAX_QUALITY) {
                    item.setQuality(item.getQuality() + 1);
                }
            }
            if (item.getSellIn() < MIDDLE_QUALITY) {
                if (item.getQuality() < MAX_QUALITY) {
                    item.setQuality(item.getQuality() + 1);
                }
            }
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
    }
}
