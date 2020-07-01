package postgres.entity.books;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
public class BookGenreId implements Serializable {

    private Long bookId;

    private Long genreId;
}
