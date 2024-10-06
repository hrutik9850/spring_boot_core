package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nt.entity.Docter;

public interface IDocterMNGService {
	

	public String recoredAddDocterRepo(Docter docter);
	public Iterable<Docter> showDocterBySorting(boolean asc,String...props);
	public Page<Docter> ShowDocterInfoByPageNo(int i, int j, boolean b, String string);
	public void  ShowDateThroughpagination(int pagesize); 
	public String deletedDocterById(List<Integer>ids);

}
