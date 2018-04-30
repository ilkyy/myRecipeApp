package com.myspring.recipeproject.repositories;

import com.myspring.recipeproject.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Id> {
}
