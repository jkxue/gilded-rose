package com.tw.tdd.gildedrose.domain;

import com.tw.tdd.gildedrose.exception.InvalidQualityException;
import lombok.Getter;
import lombok.Setter;

public class Item {

    @Getter
    @Setter
    private Integer sellIn;

    @Getter
    private Integer quality;

    public void setQuality(Integer quality) {
        if(quality < 0 || quality >= 50){
            throw new InvalidQualityException("INVALID QUALITY");
        }
        this.quality = quality;
    }

    public void sellInDecrease() {}
}
