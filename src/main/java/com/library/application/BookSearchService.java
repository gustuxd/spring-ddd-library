package com.library.application;

import com.library.domain.Isbn;

public interface BookSearchService {
    BookInformation search(Isbn isbn);
}
