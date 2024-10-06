package com.nt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import com.nt.entity.Docter;
@Component
public interface DocterRepo extends PagingAndSortingRepository<Docter, Integer>, CrudRepository<Docter, Integer> {

}
