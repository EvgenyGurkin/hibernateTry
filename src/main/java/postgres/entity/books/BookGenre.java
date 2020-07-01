package postgres.entity.books;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Accessors(chain = true)
@IdClass(BookGenreId.class)
@Table(name = "book_genre")
public class BookGenre  {

    @Id
    @Column(name = "book_id")
    private Long bookId;

    @Id
    @Column(name = "genre_id")
    private Long genreId;
}
