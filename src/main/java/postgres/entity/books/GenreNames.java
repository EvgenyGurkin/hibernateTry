package postgres.entity.books;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Proxy;
import postgres.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Proxy(lazy = false)
@Accessors(chain = true)
@Table(name = "genre_names")
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
public class GenreNames extends BaseEntity {

    @ToString.Include
    @Column(name = "genre")
    private String genre;
}
