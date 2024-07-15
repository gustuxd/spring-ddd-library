package com.library.domain;

import org.springframework.util.Assert;

import java.util.UUID;

public record CopyId(UUID id) {

    public CopyId {
        Assert.notNull(id, "CopyId must not be null");
    }

    public CopyId() {
        this(UUID.randomUUID());
    }
}
