package ie.atu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LibraryService {

  ArrayList<Book> list = new ArrayList<>();

    public void add(Book book) {
        list.add(book);
    }

    public ArrayList<Book> retrieve(){
        return list;
    }
}
