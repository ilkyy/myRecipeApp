package com.myspring.recipeproject.bootstrap;

import com.myspring.recipeproject.domain.*;
import com.myspring.recipeproject.repositories.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;

@Component
public class BootStrap  implements ApplicationListener<ContextRefreshedEvent>  {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    private IngredientRepository ıngredientRepository;
    private NotesRepositoy notesRepositoy;
    private RecipeRepository recipeRepository;

    public BootStrap(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository, IngredientRepository ıngredientRepository, NotesRepositoy notesRepositoy, RecipeRepository recipeRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.ıngredientRepository = ıngredientRepository;
        this.notesRepositoy = notesRepositoy;
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initRecipes();
    }

    private void initRecipes() {
        Recipe recipe = new Recipe();
        recipe.setDescription("recipe Desc");
        recipe.setDirection("recipe Direction");
        recipe.setDifficulty(Difficulty.HARD);
        recipe.setCookTime(2);
        recipe.setPrepTime(5);
        recipe.setServings(7);
        recipe.setUrl("url");
        recipeRepository.save(recipe);

        Notes notes = new Notes();
        notes.setRecipe(recipe);
        notes.setRecipeNotes("recipeNotes");
        notesRepositoy.save(notes);

        recipe.setNotes(notes);

        Category category = new Category();
        category.setDescription("category Desc");
        category.getRecipes().add(recipe);
        categoryRepository.save(category);

        recipe.getCategories().add(category);


        Ingredient ıngredient = new Ingredient();
        ıngredient.setAmount(BigDecimal.TEN);
        ıngredient.setDescription("ingredient desc");
        ıngredient.setRecipe(recipe);


        UnitOfMeasure unitOfMeasure = new UnitOfMeasure();
        unitOfMeasure.setDescription("unitOfMeasure Desc");
        unitOfMeasureRepository.save(unitOfMeasure);

        ıngredient.setUnitOfMeasure(unitOfMeasure);
        ıngredientRepository.save(ıngredient);

        recipe.getIngredients().add(ıngredient);

        recipeRepository.save(recipe);

    }
}
