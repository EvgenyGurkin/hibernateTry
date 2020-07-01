package postgres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import postgres.service.AuthorsService;

@RestController
public class AuthorsController {

    @Autowired
    private AuthorsService authorsService;

    @GetMapping("/author/{id}")
    public Object getById(@PathVariable Long id) {
        return  authorsService.getAuthor(id);
    }

    @GetMapping("/")
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }

}
