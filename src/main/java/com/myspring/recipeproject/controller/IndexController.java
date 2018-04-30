package com.myspring.recipeproject.controller;

import com.myspring.recipeproject.RecipeService;
import com.myspring.recipeproject.repositories.CategoryRepository;
import com.myspring.recipeproject.repositories.RecipeRepository;
import com.myspring.recipeproject.repositories.UnitOfCategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getPageIndex(Model model){

        model.addAttribute("recipeList",recipeService.getAllRecipes());
        return "index";
    }
}
