package com.myspring.recipeproject;

import com.myspring.recipeproject.domain.Recipe;
import com.myspring.recipeproject.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Iterable<Recipe> getAllRecipes(){
        return recipeRepository.findAll();
    }
}
