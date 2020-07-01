package postgres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import postgres.service.PublisherService;


@RestController
public class PublicherController {

    @Autowired
    private PublisherService publisherService;

    @GetMapping("/publisher/{id}")
    public Object getById(@PathVariable Long id){
        return  publisherService.getPublisher(id);
    }

}
