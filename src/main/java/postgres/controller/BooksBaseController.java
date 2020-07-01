package postgres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import postgres.service.BooksBaseService;

@RestController
public class BooksBaseController {

    @Autowired
    private BooksBaseService booksBaseService;

    @GetMapping("/books/{id}")
    public Object getById(@PathVariable Long id) {
        return  booksBaseService.getBooksBase(id);
    }

    @GetMapping("/books/info/{id}")
    public Object getFullInfoById(@PathVariable Long id) {
        return booksBaseService.getBookInfo(id);
    }

    @GetMapping("/books/{id}/genres")
    public Object getGenreById(@PathVariable Long id) {
        return booksBaseService.getBookGenres(id);
    }
}
