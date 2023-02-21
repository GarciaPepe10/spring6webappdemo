package guru.springframework.spring6webbapp.controllers;

import guru.springframework.spring6webbapp.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")
    public String findAll(Model model){
        model.addAttribute("authors",authorService.findAll());
        return "authors";
    }
}
