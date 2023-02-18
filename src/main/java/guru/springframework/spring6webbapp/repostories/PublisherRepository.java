package guru.springframework.spring6webbapp.repostories;

import guru.springframework.spring6webbapp.domain.Author;
import guru.springframework.spring6webbapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
