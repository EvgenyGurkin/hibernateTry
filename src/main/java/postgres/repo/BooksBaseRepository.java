package postgres.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import postgres.entity.books.BooksBase;

public interface BooksBaseRepository extends JpaRepository<BooksBase, Long> {
}
