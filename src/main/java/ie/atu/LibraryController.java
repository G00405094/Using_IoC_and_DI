package ie.atu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class LibraryController {
    final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/book")

    public ArrayList<Book> getBook(){
        return libraryService.retrieve();
    }
    @PostMapping("/bookBody")
    public void addBook(Book book1){
        libraryService.add(book1);
    }
}
