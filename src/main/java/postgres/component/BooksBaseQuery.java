package postgres.component;

import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.stereotype.Component;
import postgres.entity.books.*;

@Component
public class BooksBaseQuery extends AbstractQuery {

    public JPQLQuery<?> findBook(Long bookID) {
        QBooksBase bb = QBooksBase.booksBase;
        final QAuthors au = QAuthors.authors;
        final QPublisher pb = QPublisher.publisher;
        return query.from(bb)
                .leftJoin(au).on(au.id.eq(bb.authorId.id))
                .leftJoin(pb).on(pb.id.eq(bb.publisherId.id))
                .where(bb.id.eq(bookID))
                .select(bb.id, bb.name.as("book_name"), bb.releaseDate, bb.pageNumber, pb.name.as("pub_name"),
                        au.name.as("autors_name"));
    }


    public JPQLQuery<?> getBookGenres(Long bookId) {
        QBooksBase bb = QBooksBase.booksBase;
        final QBookGenre bg = QBookGenre.bookGenre;
        final QGenreNames gn = QGenreNames.genreNames;
        JPAQuery<Long> values = query.select(bg.genreId).from(bg)
                .join(bb).on(bb.id.eq(bg.bookId))
                .where(bb.id.eq(bookId));
        return query.select(gn.genre).from(gn)
                .where(gn.id.in(values));
    }
}
