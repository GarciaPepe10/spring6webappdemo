package guru.springframework.spring6webbapp.repostories;

import guru.springframework.spring6webbapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
