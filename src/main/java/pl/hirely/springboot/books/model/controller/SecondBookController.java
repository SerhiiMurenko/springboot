package pl.hirely.springboot.books.model.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.hirely.springboot.books.model.Book;

@RestController
@RequestMapping("/book")
public class SecondBookController {
    @RequestMapping(value = "/zemsta2",
            method = RequestMethod.GET)
    public Book getZemstaSecond() {
        return new Book("Zemsta");
    }
}