package com.library.domain.entity;

import org.springframework.util.Assert;

public record Barcode(String barcode) {
    public Barcode {
        Assert.notNull(barcode, "Bar code must not be null");
    }
}
