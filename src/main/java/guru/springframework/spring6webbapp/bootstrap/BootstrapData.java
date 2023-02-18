package guru.springframework.spring6webbapp.bootstrap;

import guru.springframework.spring6webbapp.domain.Author;
import guru.springframework.spring6webbapp.domain.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import guru.springframework.spring6webbapp.repostories.AuthorRepository;
import guru.springframework.spring6webbapp.repostories.BookRepository;

@Component
//@SpringBootApplication(scanBasePackages = {"com.project.data.runner"})
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author();
        eric.setName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("54757585");

        Author rodSaved = authorRepository.save(rod);
        Book dnoEJBSaved = bookRepository.save(noEJB);


        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(dnoEJBSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);

        System.out.println("In bootstrap :" );
        System.out.println("authors :" + authorRepository.count());
        System.out.println("books :" + bookRepository.count());

        System.out.println("Author :" + eric.getName() + " " + eric.getLastName());
        System.out.println("books :" + eric.getBooks().size());

        System.out.println("Author :" + rod.getName() + " " + rod.getLastName());
        System.out.println("books :" + rod.getBooks().size());

    }
}
