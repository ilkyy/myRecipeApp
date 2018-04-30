package com.myspring.recipeproject.repositories;

import com.myspring.recipeproject.domain.Notes;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface NotesRepositoy extends CrudRepository<Notes,Id> {
}
