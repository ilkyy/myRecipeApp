package com.myspring.recipeproject;

import com.myspring.recipeproject.domain.Recipe;
import com.myspring.recipeproject.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
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
