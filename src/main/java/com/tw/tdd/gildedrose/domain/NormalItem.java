package com.tw.tdd.gildedrose.domain;

public class NormalItem extends Item{

    @Override
    public void sellInDecrease() {
        this.setSellIn(getSellIn() -1);
        this.setQuality(this.getQuality() - 1);
    }
}
