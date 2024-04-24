package com.epi.gestionbib_version1;

import com.epi.gestionbib_version1.Entity.Category;
import com.epi.gestionbib_version1.Entity.Film;
import com.epi.gestionbib_version1.Repository.CategoryRepository;
import com.epi.gestionbib_version1.Repository.FilmRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionbibVersion1Application {

    public static void main(String[] args) {
        SpringApplication.run(GestionbibVersion1Application.class, args);
    }

    @Bean
    CommandLineRunner start(CategoryRepository c, FilmRepository f){
        return args -> {
            Category c1=new Category("Fantasie");
            Category c2=new Category("Comedie");
            c.save(c1);
            c.save(c2);
            Film f1= new Film(null,"signeur des anneaux","film des anneés 2000",2001,c1);
            Film f2= new Film(null,"Titanic","film des annneés 90",1997,c2);
            f.save(f1);
            f.save(f2);
           // f.findAll().forEach(System.out::println);
            f.findAll().forEach(p-> System.out.println(p));
        };
    }



}
