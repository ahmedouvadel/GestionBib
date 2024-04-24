package com.epi.gestionbib_version1.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @JsonIgnore
    @OneToMany(mappedBy = "categorie",fetch = FetchType.LAZY)
    private List<Film> film = new ArrayList<>();

    public Category(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
