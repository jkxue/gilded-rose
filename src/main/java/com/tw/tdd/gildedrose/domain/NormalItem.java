package com.tw.tdd.gildedrose.domain;

public class NormalItem extends Item{

    @Override
    public void sellInDecrease() {

        this.setSellIn(this.getSellIn() -1);
        if(this.getQuality() > 0){
            this.setQuality(this.getQuality() - 1);
        }
    }
}
