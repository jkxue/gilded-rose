package com.tw.tdd.gildedrose.domain;

public class BackstagePass extends Item{

    @Override
    public void sellInDecrease() {

        if (this.getSellIn() > 10) {
            if(this.getQuality() + 1 <= 50){
                this.setQuality(this.getQuality() + 1);
            }
        }else if(this.getSellIn() > 5 && this.getSellIn() <= 10){
            if(this.getQuality() + 2 <= 50){
                this.setQuality(this.getQuality() + 2);
            }else{
                this.setQuality(50);
            }
        }else if(this.getSellIn() > 0 && this.getSellIn() <= 5){
            if(this.getQuality() + 3 <= 50){
                this.setQuality(this.getQuality() + 3);
            }else{
                this.setQuality(50);
            }
        }
        this.setSellIn(this.getSellIn() - 1);
    }
}
