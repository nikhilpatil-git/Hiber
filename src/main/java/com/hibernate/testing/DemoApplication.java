package com.hibernate.testing;

import com.mkyong.persistence.HibernateUtil;
import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("Hibernate one to one (XML mapping)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

/*		Stock stock = new Stock();

		stock.setStockCode("4715");
		stock.setStockName("GENM");

		StockDetail stockDetail = new StockDetail();
		stockDetail.setCompName("GENTING Malaysia");
		stockDetail.setCompDesc("Best resort in the world");
		stockDetail.setRemark("Nothing Special");
		stockDetail.setListedDate(new Date());

		stock.setStockDetail(stockDetail);
		stockDetail.setStock(stock);

		session.save(stock);
		session.getTransaction().commit();*/

		System.out.println("Done");

		System.out.println("All Good");
	}
}
