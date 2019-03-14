package com.chirichignoa.tacocloud.repository;

import com.chirichignoa.tacocloud.model.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
