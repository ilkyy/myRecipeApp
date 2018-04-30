package com.myspring.recipeproject.repositories;

import com.myspring.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;
import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Id> {

    Optional<Category> findByDescription(String desc);
}
