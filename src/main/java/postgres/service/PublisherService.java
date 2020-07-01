package postgres.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import postgres.entity.books.Publisher;
import postgres.repo.PublisherRepository;

@Slf4j
@Service
@Transactional
public class PublisherService {

    @Autowired
    PublisherRepository publisherRepository;

    @Transactional(readOnly = true)
    public Publisher getPublisher(Long id) {
        final Publisher rez = publisherRepository.getOne(id);
        return rez;
    }

}
