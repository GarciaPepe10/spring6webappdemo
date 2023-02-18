package guru.springframework.spring6webbapp.repostories;

import guru.springframework.spring6webbapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
