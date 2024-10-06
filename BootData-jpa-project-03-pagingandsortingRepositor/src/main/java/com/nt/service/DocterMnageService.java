package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Docter;
import com.nt.repository.DocterRepo;

@Service("doctermnageservice")
public class DocterMnageService implements IDocterMNGService {
	@Autowired
	public DocterRepo docterRepo  ;

	@Override
	public String recoredAddDocterRepo(Docter docter) {
		Docter  recoredAdd = docterRepo.save(docter);
		return "Add a recored Docter in data base "+recoredAdd.getId() ;
	}

	@Override
	public Iterable<Docter> showDocterBySorting(boolean asc, String... props) {
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC,props);
		Iterable<Docter> it = docterRepo.findAll(sort);
		
		return it;
	}

	@Override
	public org.springframework.data.domain.Page<Docter> ShowDocterInfoByPageNo(int pageno, int pagesize, boolean ascorder, String props) {
		Sort sort = Sort.by(ascorder?Direction.ASC:Direction.DESC,props);
		PageRequest pageable = PageRequest.of(pageno,pagesize,sort);
		org.springframework.data.domain.Page<Docter>  page = docterRepo.findAll(pageable);
		return page;
	}

	@Override
	public void ShowDateThroughpagination(int pagesize) {
		long count  = docterRepo.count();
		System.out.println(count);
		long pagecount = count/pagesize ;
		System.out.println("--------------------------------------"+pagecount);
		if(count%pagecount!= 0) {
			pagecount++ ;
			for(int i =0 ;i<pagecount;++i) {
				PageRequest pageble = PageRequest .of(i, pagesize);
				Page<Docter> page= docterRepo.findAll(pageble);
				System.out.println("page"+(page.getNumber()+i)+"records of "+page.getTotalPages());
				page.getContent().forEach(System.out::println);
				System.out.println("________________________________");
			}
		}
		
	}

	@Override
	public String deletedDocterById(List<Integer> ids) {
		List<Docter> list =  (List<Docter>) docterRepo.findAllById(ids);
		docterRepo.deleteAll(list);
		
		return "deleted a number of recored "+list.size();
	}
	
	

	
	

}
