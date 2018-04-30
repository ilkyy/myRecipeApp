package com.myspring.recipeproject;

import com.myspring.recipeproject.domain.Recipe;
import com.myspring.recipeproject.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class RecipeServiceTest {

    private RecipeService recipeService;

    @Mock
    private RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeService(recipeRepository);

        Recipe recipe = new Recipe();
        recipe.setDescription("testDesc");
        Set<Recipe> returnRecipes = new HashSet<>(0);
        returnRecipes.add(recipe);

        when(recipeService.getAllRecipes()).thenReturn(returnRecipes);
    }

    @Test
    public void getAllRecipes() {

        List<Recipe> recipeList = new ArrayList<>(0);
        recipeService.getAllRecipes().forEach(recipeList::add);

        assertEquals(1,recipeList.size());
        assertEquals("testDesc",recipeList.get(0).getDescription());


    }
}