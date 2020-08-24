package com.tw.tdd.gildedrose.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertNotNull;

public class ItemTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void given_quality_not_negative_and_not_more_than_50_when_init_item_then_get_item() {
        int quality1= 0;
        int quality2= 25;
        int quality3 = 50;

        Item item1 = new Item();
        item1.setQuality(quality1);
        Item item2 = new Item();
        item2.setQuality(quality2);
        Item item3 = new Item();
        item3.setQuality(quality3);

        assertNotNull(item1);
        assertEquals(quality1, item1.getQuality());
        assertNotNull(item2);
        assertEquals(quality2, item2.getQuality());
        assertNotNull(item3);
        assertEquals(quality3, item3.getQuality());
    }
}
