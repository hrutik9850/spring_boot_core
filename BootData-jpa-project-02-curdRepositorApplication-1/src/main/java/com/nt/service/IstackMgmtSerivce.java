package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.StockInfo;

public interface IstackMgmtSerivce {
	public String registerstock(StockInfo info);
	public String registerallstock(List<StockInfo> list);
	public long featchstockInfoCount();
	public boolean checkstockinfoAvailbility(Integer id);
	public Iterable<StockInfo> showAllstockInfo();

	public Iterable<StockInfo> shoqAllStockInfoByIds(Iterable<Integer> ids);
	public Optional<StockInfo>  showstockInfoBy(Integer id);
	public StockInfo  findstockInfoBy(Integer id) throws IllegalAccessException;
}
