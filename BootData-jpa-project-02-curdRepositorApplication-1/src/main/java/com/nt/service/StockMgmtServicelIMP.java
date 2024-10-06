package com.nt.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.StockInfo;
import com.nt.repository.IstockDetailsRepository;

@Service("stockmgmtservicelimp")
public class StockMgmtServicelIMP implements IstackMgmtSerivce {
	@Autowired
	public IstockDetailsRepository stockrep ;

	@Override
	public String registerstock(StockInfo info) {
//		StockInfo info1 = stockrep.save(info);
//		return "object is saved with the id value :"+info.getStockId();
		System.out.println("Repo obj class name::"+stockrep.getClass()+"......."+Arrays.toString(stockrep.getClass().getInterfaces()));
		
		int idval = stockrep.save(info).getStockId();
		return "Object is saved with the id value::"+idval;
		
	}

	@Override
	public String registerallstock(List<StockInfo> list) {
		Iterable<StockInfo> saveAllList = stockrep.saveAll(list);
		return list.size()+"save all stockInfo";
	}

	@Override
	public long featchstockInfoCount() {
		long numberofstock =  stockrep.count();
		return numberofstock;
	}

	@Override
	public boolean checkstockinfoAvailbility(Integer id) {
		
		return stockrep.existsById(id);
	}

	@Override
	public Iterable<StockInfo> showAllstockInfo() {
		
		return stockrep.findAll();
	}

	@Override
	public Iterable<StockInfo> shoqAllStockInfoByIds(Iterable<Integer> ids) {
		
		return stockrep.findAllById(ids);
	}

	@Override
	public Optional<StockInfo> showstockInfoBy(Integer id) {
		Optional<StockInfo> stoc = stockrep.findById(id);
		return stoc;
	}

	@Override
	public StockInfo findstockInfoBy(Integer id) throws IllegalAccessException {
//		Optional<StockInfo> opt = stockrep.findById(id);
//		if(opt.isPresent()) {
//			System.out.println("101 is exite a recored");
//			StockInfo info = opt.get();
//		return info;
//		}else {
//			throw new IllegalAccessException("StockInfo is not exite id ");
//		}
		return stockrep.findById(id).orElseThrow(()->new IllegalArgumentException("stockInfo id is not exite"));
		
	}

	
	

}
