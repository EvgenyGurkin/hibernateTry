package postgres.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import postgres.entity.books.Authors;
import postgres.repo.AuthorRepository;

@Slf4j
@Service
@Transactional
public class AuthorsService {

    @Autowired
    AuthorRepository authorRepository;

    @Transactional(readOnly = true)
    public Authors getAuthor(Long id) {
        final Authors rez = authorRepository.getOne(id);
        return rez;
    }
}
