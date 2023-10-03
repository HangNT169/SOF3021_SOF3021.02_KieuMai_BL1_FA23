package com.poly.hangnt169.sof3021.B10_JPA.repository;

import com.poly.hangnt169.sof3021.B10_JPA.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    // CRUD 1 bang => Khong can phai viet
    // Custom SQL
    // 1. Query Creation
    // 2. Raw SQL
       // 1. Native query => Truy van SQL
       // 2. JPQL(JPA Query Language) => Truy van tren thuc the

//    Category findCategoryById1AndAndCategoryName(Long id,String categoryName);

    @Query("SELECT c FROM Category c WHERE c.categoryName = ?3 AND c.id1 = ?1")
    Category search(Long id, String categoryCode, String categoryName);

}
