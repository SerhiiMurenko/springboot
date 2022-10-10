package pl.hirely.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.hirely.springboot.model.Book;

@RestController
@RequestMapping("/book")
public class SecondBookController {
    @RequestMapping(value = "/zemsta",
            method = RequestMethod.GET)
    public Book getZemstaSecond() {
        return new Book("Zemsta");
    }
}