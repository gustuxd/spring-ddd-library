package com.library.domain;

import jakarta.persistence.*;
import org.springframework.util.Assert;

@Entity
public class Copy {
    @EmbeddedId
    private CopyId id;
    @Embedded
    @AttributeOverride(name = "id", column = @Column(name = "book_id"))
    private BookId bookId;
    @Embedded
    private Barcode barcode;
    private Boolean available;

    public Copy(BookId bookId, Barcode barCode) {
        Assert.notNull(bookId, "bookId must not be null");
        Assert.notNull(barCode, "barCode must not be null");
        this.id = new CopyId();
        this.bookId = bookId;
        this.barcode = barcode;
        this.available = true;
    }

    public void makeUnavailable() {
        this.available = false;
    }

    public void makeAvailable() {
        this.available = true;
    }
}
