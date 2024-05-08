package com.java;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyCrudRepository extends CrudRepository<MyCrudEntity, Integer> {

}
