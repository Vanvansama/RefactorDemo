package gildedRose;

/**
 * Create with IDEA
 *
 * @Author: gitee.com/KamisamaXX
 * @Date: Create in 0:16 2019/8/20
 * @Description:
 */
public class strategyFactory {

    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String AGED_BRIE = "Aged Brie";

    public updateStrategy getStrategy(String name) {
        if (name.equals(AGED_BRIE)) {
            return new AgedBrie();
        } else if (name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {
            return new BackstagePasses();
        } else if (name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
            return new Sulfuras();
        } else {
            return new Normal();
        }
    }
}
