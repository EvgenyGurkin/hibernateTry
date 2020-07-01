package postgres.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import postgres.entity.books.Authors;

public interface AuthorRepository extends JpaRepository<Authors, Long> {
}
