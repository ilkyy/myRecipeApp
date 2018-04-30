package com.myspring.recipeproject.repositories;

import com.myspring.recipeproject.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient,Long> {
}
