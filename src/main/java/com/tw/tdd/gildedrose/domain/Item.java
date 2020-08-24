package com.tw.tdd.gildedrose.domain;

import com.tw.tdd.gildedrose.exception.InvalidQualityException;
import lombok.Getter;

public class Item {

    @Getter
    private Integer quality;

    public void setQuality(Integer quality) {
        if(quality < 0 || quality >= 50){
            throw new InvalidQualityException("INVALID QUALITY");
        }
        this.quality = quality;
    }
}
