package com.library.domain.entity;

import org.apache.commons.validator.routines.ISBNValidator;

public record Isbn(String value) {
    private static final ISBNValidator VALIDATOR = new ISBNValidator();

    public Isbn {
        if (!VALIDATOR.isValid(value)) {
            throw new IllegalArgumentException("Invalid isbn: " + value);
        }
    }
}
