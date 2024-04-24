package com.epi.gestionbib_version1.Controller;

import com.epi.gestionbib_version1.Entity.Film;
import com.epi.gestionbib_version1.Repository.FilmRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FilmController {

    FilmRepository filmRepository;

    public FilmController(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
    @GetMapping("/film")
    public String listFilm(Model model){
        List<Film> listfilm = filmRepository.findAll();
        model.addAttribute("film",listfilm);
        return  "listefilms";
    }

    @GetMapping("/supprimer")
    public String deleteById(Long id){
        filmRepository.deleteById(id);
        return "redirect:/film";
    }
}
