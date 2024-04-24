package com.epi.gestionbib_version1.Repository;


import com.epi.gestionbib_version1.Entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film,Long> {
}
