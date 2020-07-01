package postgres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import postgres.service.GenreNamesService;

@RestController
public class GenreNamesController {

    @Autowired
    private GenreNamesService genreNamesService;

    @GetMapping("/genre/{id}")
    public Object getById(@PathVariable Long id) {
        return  genreNamesService.getGenre(id);
    }

}
