package com.myspring.recipeproject.repositories;

import com.myspring.recipeproject.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;
import java.util.Optional;

public interface UnitOfCategoryRepository extends CrudRepository<UnitOfMeasure,Id> {

    Optional<UnitOfMeasure> findByDescription(String desc);
}
