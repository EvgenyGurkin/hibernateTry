package postgres.entity.books;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class BookInfo  {
    Long id;

    String name;

    LocalDate releaseDate;

    Integer pageNumber;

    String pb_name;

    String au_name;
}
