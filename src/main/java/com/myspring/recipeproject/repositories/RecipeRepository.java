package com.myspring.recipeproject.repositories;

import com.myspring.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface RecipeRepository extends CrudRepository<Recipe,Id> {
}
