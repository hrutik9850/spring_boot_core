package com.nt.runners;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.StockInfo;
import com.nt.repository.IstockDetailsRepository;
import com.nt.service.IstackMgmtSerivce;
@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IstackMgmtSerivce stockservice;

	@Override
	public void run(String... args) throws Exception {
		
		/*StockInfo info1 = new StockInfo( "Lenovo","AUTOMOBLILE","BSE",50000.00, "Lenovo");
		StockInfo info2 = new StockInfo( "HP","AUTOMOBLILE","NSE",70000.00, "HP");
		StockInfo info3 = new StockInfo( "ASUS","AUTOMOBLILE","BSE",30000.00, "ASUS");
		List<StockInfo> list =  List.of(info1,info2,info3);	*/
		try {
	
//			String msg = stockservice.registerallstock(list);
//			System.out.println(msg);
//			long stockrecord =stockservice.featchstockInfoCount();
//			System.out.println(stockrecord+"  number of stock information are store ");
//			System.out.println("101 id stockInfo exite...?"+ stockservice.checkstockinfoAvailbility(101));
//			
//			Iterable<StockInfo> It = stockservice.showAllstockInfo();
//			It.forEach(doc->{
//				System.out.println(doc);
//			});
//			System.out.println("-------------------");
//			It.forEach(doc->System.out.println(doc));
//			System.out.println("-----------------");
			
//			
//			Iterable<StockInfo> stock = stockservice.shoqAllStockInfoByIds(List.of(101,102,103 ,1,11));
//			((List<StockInfo>) stock).size();
//			stock.forEach(doc->System.out.println(doc));
			
//			Optional<StockInfo> opt = stockservice.showstockInfoBy(10111);
//			try {
//				if(opt.isPresent()) {
//					System.out.println("101 is exites a records ");
//				}else System.out.println("records not exites");
//			} catch (Exception  e) {
//				
//				System.out.println(e.getMessage());
//				
//			}
			try {
				StockInfo  info = stockservice.findstockInfoBy(101);
			System.out.println(info);	
			}catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
