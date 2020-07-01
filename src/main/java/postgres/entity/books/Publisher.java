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
@Table(name = "publisher")
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
public class Publisher extends BaseEntity {

    @ToString.Include
    @Column(name = "name", length = 300)
    private String name;

}
