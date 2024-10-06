package com.nt.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.modle.EmployeeModle;

public interface IEmployeeRepo extends JpaRepository<EmployeeModle, Integer> {



}
