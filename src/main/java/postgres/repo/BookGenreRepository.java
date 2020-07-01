package postgres.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import postgres.entity.books.BookGenre;
import postgres.entity.books.BookGenreId;

public interface BookGenreRepository extends JpaRepository<BookGenre, BookGenreId> {
}
