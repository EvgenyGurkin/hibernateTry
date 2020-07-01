package postgres.entity.books;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Proxy;
import postgres.entity.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Proxy(lazy = false)
@Accessors(chain = true)
@Table(name = "books_base")
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
public class BooksBase extends BaseEntity {

    @ToString.Include
    @Column(name = "name", length = 200)
    private String name;

    @ToString.Include
    @Column(name = "release_date")
    private LocalDate releaseDate;

    @ToString.Include
    @Column(name = "page_number")
    private int pageNumber;

    @ManyToOne
    @JoinColumn(name =  "author_id")
    private Authors authorId;

    @ManyToOne
    @JoinColumn(name =  "publisher_id")
    private Publisher publisherId;

    @ToString.Include
    @Column(name = "isbn")
    private String isbn;

    @ToString.Include
    @Column(name = "price")
    private double price;

    @ToString.Include
    @Column(name = "discount_price")
    private double discountPrice;
}
