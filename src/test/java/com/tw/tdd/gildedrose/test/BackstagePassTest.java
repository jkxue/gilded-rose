import com.tw.tdd.gildedrose.domain.BackstagePass;
import com.tw.tdd.gildedrose.domain.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackstagePassTest {

    @Test
    public void given_backstagePass_with_sellIn_greater_than_10_and_quality_greater_than_0_when_sellIn_minus_one_then_the_quality_increase_one_and_not_more_than_50() {

        Integer quality1 = 20;
        Integer sellIn1 = 15;
        Item backstagePass1 = new BackstagePass();
        backstagePass1.setQuality(quality1);
        backstagePass1.setSellIn(sellIn1);

        Integer quality2 = 50;
        Integer sellIn2 = 15;
        Item backstagePass2 = new BackstagePass();
        backstagePass2.setQuality(quality2);
        backstagePass2.setSellIn(sellIn2);

        backstagePass1.sellInDecrease();
        backstagePass2.sellInDecrease();

        assertEquals(sellIn1 -1, backstagePass1.getSellIn().intValue());
        assertEquals(quality1 + 1, backstagePass1.getQuality().intValue());

        assertEquals(sellIn2 -1, backstagePass2.getSellIn().intValue());
        assertEquals(50, backstagePass2.getQuality().intValue());
    }

    @Test
    public void given_backstagePass_with_sellIn_greater_than_5_and_less_or_eq_10_and_quality_greater_than_0_when_sellIn_minus_one_then_the_quality_increase_two_and_not_more_than_50() {

        Integer quality1 = 45;
        Integer sellIn1 = 10;
        Item backstagePass1 = new BackstagePass();
        backstagePass1.setQuality(quality1);
        backstagePass1.setSellIn(sellIn1);

        Integer quality2 = 49;
        Integer sellIn2 = 9;
        Item backstagePass2 = new BackstagePass();
        backstagePass2.setQuality(quality2);
        backstagePass2.setSellIn(sellIn2);

        backstagePass1.sellInDecrease();
        backstagePass2.sellInDecrease();

        assertEquals(sellIn1 -1, backstagePass1.getSellIn().intValue());
        assertEquals(quality1 + 2, backstagePass1.getQuality().intValue());

        assertEquals(sellIn2 -1, backstagePass2.getSellIn().intValue());
        assertEquals(50, backstagePass2.getQuality().intValue());
    }

    @Test
    public void given_backstagePass_with_sellIn_greater_than_0_and_less_or_eq_5_and_quality_greater_than_0_when_sellIn_minus_one_then_the_quality_increase_3_and_not_more_than_50() {

        Integer quality1 = 47;
        Integer sellIn1 = 5;
        Item backstagePass1 = new BackstagePass();
        backstagePass1.setQuality(quality1);
        backstagePass1.setSellIn(sellIn1);

        Integer quality2 = 48;
        Integer sellIn2 = 1;
        Item backstagePass2 = new BackstagePass();
        backstagePass2.setQuality(quality2);
        backstagePass2.setSellIn(sellIn2);

        backstagePass1.sellInDecrease();
        backstagePass2.sellInDecrease();

        assertEquals(sellIn1 -1, backstagePass1.getSellIn().intValue());
        assertEquals(quality1 + 3, backstagePass1.getQuality().intValue());

        assertEquals(sellIn2 -1, backstagePass2.getSellIn().intValue());
        assertEquals(50, backstagePass2.getQuality().intValue());
    }

    @Test
    public void given_backstagePass_with_sellIn_less_or_eq_0_and_quality_greater_than_0_when_sellIn_minus_one_then_the_quality_is_0() {

        Integer quality1 = 47;
        Integer sellIn1 = 0;
        Item backstagePass1 = new BackstagePass();
        backstagePass1.setQuality(quality1);
        backstagePass1.setSellIn(sellIn1);

        Integer quality2 = 48;
        Integer sellIn2 = -1;
        Item backstagePass2 = new BackstagePass();
        backstagePass2.setQuality(quality2);
        backstagePass2.setSellIn(sellIn2);

        backstagePass1.sellInDecrease();
        backstagePass2.sellInDecrease();

        assertEquals(sellIn1 -1, backstagePass1.getSellIn().intValue());
        assertEquals(0, backstagePass1.getQuality().intValue());

        assertEquals(sellIn2 -1, backstagePass2.getSellIn().intValue());
        assertEquals(0, backstagePass2.getQuality().intValue());
    }
}
