package com.nt.repo;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.modle.EmployeeModle;

public interface IEmployee_page_Repo extends PagingAndSortingRepository<EmployeeModle,Integer> {
	public Page<EmployeeModle> findAll(Pageable pageable);

}
