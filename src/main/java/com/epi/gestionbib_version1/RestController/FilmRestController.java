package com.epi.gestionbib_version1.RestController;

import com.epi.gestionbib_version1.Entity.Film;
import com.epi.gestionbib_version1.Repository.FilmRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping("api")
public class FilmRestController {

    FilmRepository filmRepository;

    public FilmRestController(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
    @GetMapping("/all")
    public List<Film> listFilm(){
         List<Film> listfilm = filmRepository.findAll();
        return listfilm;
    }
}
