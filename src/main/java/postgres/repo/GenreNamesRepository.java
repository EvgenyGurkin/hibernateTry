package postgres.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import postgres.entity.books.GenreNames;

public interface GenreNamesRepository extends JpaRepository<GenreNames, Long> {
}
