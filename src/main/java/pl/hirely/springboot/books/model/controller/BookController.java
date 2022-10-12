package pl.hirely.springboot.books.model.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.hirely.springboot.books.model.Book;


    @RestController
    @RequestMapping("/book")
    public class BookController {

        @RequestMapping(value = "/zemsta",
                method = RequestMethod.GET)
        public Book getZemsta() {
            return new Book("Zemsta");
        }


        @RequestMapping(value = "/javaSpring",
                method = RequestMethod.GET)
        public Book getKordian() {
            return new Book("JavaSpring");
        }
    }
