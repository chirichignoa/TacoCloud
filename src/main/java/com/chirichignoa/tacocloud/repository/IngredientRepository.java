package com.chirichignoa.tacocloud.repository;

import com.chirichignoa.tacocloud.model.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);
}
