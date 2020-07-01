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
@Accessors()
@Table(name = "authors")
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
public class Authors extends BaseEntity {

    @ToString.Include
    @Column(name = "name", length = 100, unique = true)
    private String name;

    @ToString.Include
    @Column(name = "date_birthday")
    private LocalDate dateBirthday;

    @ToString.Include
    @Column(name = "rip_date")
    private LocalDate ripDate;
}
