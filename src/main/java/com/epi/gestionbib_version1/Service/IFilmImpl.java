package com.epi.gestionbib_version1.Service;


import com.epi.gestionbib_version1.Entity.Film;
import com.epi.gestionbib_version1.Repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IFilmImpl implements IFilm {
    @Autowired
    FilmRepository fr;
    @Override
    public void ajouter(Film f) {
        fr.save(f);
    }
}
