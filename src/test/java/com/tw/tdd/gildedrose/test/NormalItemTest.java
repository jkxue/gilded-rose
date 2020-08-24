package com.tw.tdd.gildedrose.test;

import com.tw.tdd.gildedrose.domain.Item;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NormalItemTest {

    @Test
    public void given_normalItem_with_sellIn_and_quality_both_greater_than_0_when_sellIn_minus_one_then_the_quality_minus_one() {

        Integer quality1 = 6;
        Integer sellIn1 = 6;
        Item normalItem1 = new NormalItem();
        normalItem1.setQuality(quality1);
        normalItem1.setSellIn(sellIn1);

        Integer quality2 = 1;
        Integer sellIn2 = 1;
        Item normalItem2 = new NormalItem();
        normalItem2.setQuality(quality2);
        normalItem2.setSellIn(sellIn2);

        normalItem1.sellInDecrease();
        normalItem2.sellInDecrease();

        assertEquals(sellIn1 -1, normalItem1.getSellIn().intValue());
        assertEquals(quality1 -1, normalItem1.getQuality().intValue());

        assertEquals(sellIn2 -1, normalItem2.getSellIn().intValue());
        assertEquals(quality2 -1, normalItem2.getQuality().intValue());
    }
}
