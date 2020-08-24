package com.tw.tdd.gildedrose.domain;

public class BackstagePass extends Item{

    @Override
    public void sellInDecrease() {

        if (this.getSellIn() > 10) {
            if(this.getQuality() + 1 <= 50){
                this.setQuality(this.getQuality() + 1);
            }
        }
        this.setSellIn(this.getSellIn() - 1);
    }
}
