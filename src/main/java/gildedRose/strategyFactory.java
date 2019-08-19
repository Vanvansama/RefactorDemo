package gildedRose;

/**
 * Create with IDEA
 *
 * @Author: gitee.com/KamisamaXX
 * @Date: Create in 0:16 2019/8/20
 * @Description:
 */
public class strategyFactory {
    public updateStrategy getStrategy(String name) {
        if (name.equals("Aged Brie")) {
            return new AgedBrie();
        } else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new BackstagePasses();
        } else if (name.equals("Sulfuras, Hand of Ragnaros")) {
            return new Sulfuras();
        } else {
            return new Normal();
        }
    }
}
