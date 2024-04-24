package com.epi.gestionbib_version1.Repository;


import com.epi.gestionbib_version1.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
