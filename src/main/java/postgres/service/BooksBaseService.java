package postgres.service;

import com.querydsl.jpa.JPQLQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import postgres.component.BooksBaseQuery;
import postgres.entity.books.BooksBase;
import postgres.repo.BooksBaseRepository;

import java.util.List;

@Slf4j
@Service
@Transactional
public class BooksBaseService {

    @Autowired
    private BooksBaseRepository booksBaseRepository;

    @Autowired
    private BooksBaseQuery booksBaseQuery;

    @Transactional(readOnly = true)
    public BooksBase getBooksBase(Long id) {
        return booksBaseRepository.getOne(id);
    }

    @Transactional(readOnly = true)
    public List<?> getBookInfo(Long id) {
        final JPQLQuery<?> q = booksBaseQuery.findBook(id);
        return q.fetch();
    }

    @Transactional(readOnly = true)
    public List<?> getBookGenres(Long id) {
        final JPQLQuery<?> q = booksBaseQuery.getBookGenres(id);
        return q.fetch();
    }
}
