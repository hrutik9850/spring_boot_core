package com.nt.repojeter;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.PhoneNumber;

public interface IphonNumberRepojeter extends JpaRepository<PhoneNumber, Integer> {

}
