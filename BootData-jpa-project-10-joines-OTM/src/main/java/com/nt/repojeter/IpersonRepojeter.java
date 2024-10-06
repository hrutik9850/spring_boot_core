package com.nt.repojeter;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Person;

public interface IpersonRepojeter extends JpaRepository<Person, Integer> {

}
