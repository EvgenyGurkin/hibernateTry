package postgres.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import postgres.entity.books.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
