package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.nt.entity.Docter;

public interface IdocterRepo extends JpaRepository<Docter, Integer> {
	
public List<Docter> findBydoctAddres(String name );
public Iterable<Docter> findBydoctName(String name);
public List<Docter> findBydoctIncomeLessThanEqual(double  start );
public List<Docter> findBydoctNameLike(String name );
public List<Docter>findBydoctNameNotLike(String name);


}
