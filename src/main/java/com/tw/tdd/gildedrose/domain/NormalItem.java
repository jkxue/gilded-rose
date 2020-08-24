package com.tw.tdd.gildedrose.domain;

public class NormalItem extends Item{

    @Override
    public void sellInDecrease() {

        if (this.getSellIn() > 0) {
            if (this.getQuality() > 0) {
                this.setQuality(this.getQuality() - 1);
            }
        }else{
            if (this.getQuality() > 2) {
                this.setQuality(this.getQuality() - 2);
            }else{
                this.setQuality(0);
            }
        }
        this.setSellIn(this.getSellIn() - 1);
    }
}
