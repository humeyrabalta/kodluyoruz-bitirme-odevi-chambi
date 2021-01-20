package org.kodluyoruz.group1.library.converter;


import org.kodluyoruz.group1.library.convert.LibraryAPIConverter;
import org.kodluyoruz.group1.library.dto.BookDTO;
import org.kodluyoruz.group1.library.model.entities.Book;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;

@Component
public class BooksToBookDTOConverter implements LibraryAPIConverter<Book, BookDTO> {

    @Override
    public BookDTO convert(Book input) {

        BookDTO bookDTO = new BookDTO();

        bookDTO.setId(input.getId());
        bookDTO.setBookName(input.getBookName());
        bookDTO.setPageNumber(input.getPageNumber());
        bookDTO.setPublisherName(input.getPublisherName());
        bookDTO.setEditionNumber(input.getEditionNumber());
        bookDTO.setIsbn(input.getIsbn());
        bookDTO.setLanguagesEnum(input.getLanguagesEnum());
        bookDTO.setCategory(input.getCategory());
        bookDTO.setStatus(input.getStatus());
        bookDTO.setCreateDate(Objects.isNull(input.getCreateDate()) ? new Date():input.getCreateDate());
        bookDTO.setUpdateDate(input.getUpdateDate());
        bookDTO.setDeleted(input.isDeleted());

        bookDTO.setAuthors(input.getAuthors());
        bookDTO.setMember(input.getMember());


        return bookDTO;
    }
}
