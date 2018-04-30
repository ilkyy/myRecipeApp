package com.myspring.recipeproject.controller;

import com.myspring.recipeproject.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

public class IndexControllerTest {

    IndexController ındexController;

    @Mock
    private RecipeService recipeService;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);
        ındexController = new IndexController(recipeService);
    }


    // request and expect status ok. check request mapping, view and status. it is so useful.
    @Test
    public void getPageIndex() throws Exception{
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(ındexController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("index"));

    }
}