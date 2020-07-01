package postgres.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import postgres.entity.books.GenreNames;
import postgres.repo.GenreNamesRepository;

@Slf4j
@Service
@Transactional
public class GenreNamesService {

    @Autowired
    GenreNamesRepository genreNamesRepository;

    @Transactional(readOnly = true)
    public GenreNames getGenre(Long id) {
        final GenreNames rez = genreNamesRepository.getOne(id);
        return rez;
    }

}
